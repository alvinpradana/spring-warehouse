package com.warehouse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("")
    public String home(Model model) {
        model.addAttribute("title", "Dashboard");
        model.addAttribute("cardTitle", "Recently Added");

        return "pages/home/dashboard";
    }
}
