package com.warehouse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/users")
    public String users() {
        return "pages/users";
    }

    @GetMapping("/my-profile")
    public String profile() {
        return "pages/profile";
    }
}
