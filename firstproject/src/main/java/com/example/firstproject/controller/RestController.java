package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@ResponseBody
@Controller
public class RestController {
    @GetMapping("/restful")
    public List<Integer> rest(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        return list;
    }
}
