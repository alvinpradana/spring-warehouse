package com.warehouse.controllers;

import com.warehouse.entity.User;
import com.warehouse.services.UserNotFoundException;
import com.warehouse.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String users(Model model) {
        model.addAttribute("title", "Users");
        model.addAttribute("cardTitle", "Data Users");
        model.addAttribute("users", userService.findAll());

        return "pages/users/users";
    }

    @GetMapping("/user/create")
    public String usersAdd(Model model) {
        model.addAttribute("title", "Create User");
        model.addAttribute("cardTitle", "Create a new user.");
        model.addAttribute("user", new User());

        return "pages/users/form";
    }

    @PostMapping("/user/store")
    public String saveUser(User user, RedirectAttributes attributes) {
        userService.save(user);
        attributes.addFlashAttribute("alert", "User added successfully.");

        return "redirect:/users";
    }

    @GetMapping("/user/edit/{id}")
    public String editUser(@PathVariable("id") Long id, Model model, RedirectAttributes attributes) {
        try {
            User user = userService.get(id);
            model.addAttribute("user", user);
            model.addAttribute("title", "Update User");
            model.addAttribute("cardTitle", "Update a user.");

            return "/pages/users/form";
        } catch (UserNotFoundException e) {
            attributes.addFlashAttribute("alert", e.getMessage());
            return "redirect:/users";
        }
    }

    @GetMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id, RedirectAttributes attributes) {
        try {
            userService.delete(id);
            attributes.addFlashAttribute("alert", "User deleted successfully.");
        } catch (UserNotFoundException e) {
            attributes.addFlashAttribute("alert", e.getMessage());
        }
            return "redirect:/users";
    }

    @GetMapping("/my-profile")
    public String profile() {
        return "pages/profile";
    }
}
