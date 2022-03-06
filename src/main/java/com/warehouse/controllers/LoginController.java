package com.warehouse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("title", "Login");
        model.addAttribute("cardTitle", "Sign in to your account.");

        return "pages/auth/login";
    }
}
