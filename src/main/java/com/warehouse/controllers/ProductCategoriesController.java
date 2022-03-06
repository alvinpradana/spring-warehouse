package com.warehouse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product-categories")
public class ProductCategoriesController {

    @GetMapping("")
    public String productCategories(Model model) {
        model.addAttribute("title", "Categories");
        model.addAttribute("cardTitle", "Data Product Categories");

        return "pages/categories/product-categories";
    }

    @GetMapping("/create")
    public String categoryCreate(Model model) {
        model.addAttribute("title", "Create Category");
        model.addAttribute("cardTitle", "Create new product category.");

        return "pages/categories/form";
    }
}
