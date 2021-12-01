package com.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MVC_webController {

@RequestMapping("/A_NEW")
    public String newpage(){

        return "newpage";// returning newPage.jsp for view
    }
    @RequestMapping("/home_N")
    public String defaultMapping(){

    return "index";// returning index.jsp for view
    }
}
