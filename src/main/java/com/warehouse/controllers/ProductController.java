package com.warehouse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductController {

    @GetMapping("")
    public String product(Model model) {
        model.addAttribute("title", "Products");
        model.addAttribute("cardTitle", "Data Products");

        return "pages/products/products";
    }

    @GetMapping("/create")
    public String productCreate(Model model) {
        model.addAttribute("title", "Create Product");
        model.addAttribute("cardTitle", "Create new product.");

        return "pages/products/form";
    }
}
