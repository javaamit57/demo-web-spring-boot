package com.web.controller;


import com.web.model_class.MVC_Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class MVC_webController {

@RequestMapping("/A_NEW")
    public String new_page(){

        return "newpage";// returning newPage.jsp for view
    }
    @RequestMapping("/home_N")
    public String default_Mapping(){

    return "index";// returning index.jsp for view
    }
    @RequestMapping("/mypage")
    public String my_page(){

        return "mypage"; // returning mypage.jsp for view
    }
    @RequestMapping("/filename")
    public String mypage_File(){

        return "filename"; // returning filename.jsp for view

    }@RequestMapping(value = "/hello",method = POST)
    public String hi_sir(@RequestParam("name")String name, Model model){
    model.addAttribute("USER_ID",name);
    model.addAttribute("name","String");
        MVC_Employee mvc_employee=new MVC_Employee("sanjay",43,"MVC");
        return "hello";

    }
}
