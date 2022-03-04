package com.warehouse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductCategoriesController {

    @GetMapping("/product-categories")
    public String productCategories() {
        return "pages/product-categories";
    }
}
