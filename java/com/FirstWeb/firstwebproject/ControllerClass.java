package com.FirstWeb.firstwebproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControllerClass<model> {

    @Autowired
    private Authentication authentic;

//    public ControllerClass(Authentication authentic) {
//        this.authentic = authentic;
//    }

    @RequestMapping("/first")
    @ResponseBody
    public String firstPro() {
        return "Hello sami";
    }

    @RequestMapping("/hello")
    public String firstJsp() {
        return "hello";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String gotoLoginpage() {
        //model.addAttribute("name",name);
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String gotoWelcomepage(@RequestParam String name,@RequestParam String password, Model model) {

        if(authentic.authemticate(name,password)){
        model.addAttribute("name",name);
            return "welcomepage";
        }

        model.addAttribute("ErrorMessage","Invalid User Credential");
        return "login";
    }
}
