package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MvcController {
    @GetMapping("/mvcTest")
    public String helloMvc(Model model){
        model.addAttribute("name", "JunHyuk");
        return "mvc";
    }
}
