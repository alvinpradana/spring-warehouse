package com.warehouse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("title", "Register");
        model.addAttribute("cardTitle", "Create your Warehouse account.");

        return "pages/auth/register";
    }
}
