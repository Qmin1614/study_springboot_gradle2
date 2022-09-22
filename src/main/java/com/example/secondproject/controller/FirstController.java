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

    @GetMapping(value = {"/hi"})
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "규민");
        return "greetings";
    }

    @GetMapping(value = {"/bye"})
    public String seeYouNext(Model model) {
        model.addAttribute("nickname", "규민");
        return "goodbye";
    }
}
