package com.najilouis.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index.html";
    }

    @RequestMapping("/second")
    public String secondPage() {
        return "second.html";
    }
}
