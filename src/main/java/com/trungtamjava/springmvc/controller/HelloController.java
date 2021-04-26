package com.trungtamjava.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "hello";
    }

    @RequestMapping(value = "/say-hello", method = RequestMethod.GET)
    public String sayHello(ModelMap map) {
        map.addAttribute("msg", "Trung tam java");
        return "say-hello";
    }
}