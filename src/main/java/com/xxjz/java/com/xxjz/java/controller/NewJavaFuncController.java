package com.xxjz.java.com.xxjz.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewJavaFuncController {

    @GetMapping("/lambdaresult")
    public String showShowResultPage(){
        return "show_result";
    }
}
