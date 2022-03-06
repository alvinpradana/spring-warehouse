package com.warehouse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/team")
public class TeamController {

    @GetMapping("")
    public String team(Model model) {
        model.addAttribute("title", "Team");
        model.addAttribute("cardTitle", "Data Team");

        return "pages/team/team";
    }

    @GetMapping("/create")
    public String teamCreate(Model model) {
        model.addAttribute("title", "Create Team");
        model.addAttribute("cardTitle", "Create a new team.");

        return "pages/team/form";
    }
}
