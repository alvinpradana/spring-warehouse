package com.warehouse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DivisionController {

    @GetMapping("/division")
    public String division() {
        return "pages/division";
    }
}
