package com.example.secondproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created with IntelliJ IDEA.
 * User: pkm16
 * Date: 2022-09-22
 * Time: 오후 4:38
 * Comments:
 */
@Controller
public class FirstController {

    @GetMapping(value = {"/"})
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "규민");
        return "greetings";
    }
}
