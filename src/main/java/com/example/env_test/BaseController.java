package com.example.env_test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {
    @Value("${VAR}")
    private String var;

    @GetMapping("/")
    public String hello(){
        return "hello";
    }
    @GetMapping("/env")
    public String showVal(Model model){
        model.addAttribute("var", var);
        System.out.println("The variable value: "+ var);
        return "hello";
    } 


}
