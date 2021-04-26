package com.trungtamjava.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/i18n")
    public String index() {
        return "i18n";
    }

}
