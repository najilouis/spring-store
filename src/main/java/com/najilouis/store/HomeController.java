package com.najilouis.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Value("${spring.application.name}")
    private String appName;

    @Value("${app.page-size}")
    private int appPageSize;

    @RequestMapping("/")
    public String index() {
//        String test = "hello";
//        System.out.println(test);
//        System.out.println("App Name: "+ appName);
//        System.out.println("Page Size: "+ appPageSize);
        System.out.println("App Name: "+ appName + " — " + "Page Size: "+ appPageSize);
        return "index.html";
    }

    @RequestMapping("/second")
    public String secondPage() {
        return "second.html";
    }
}
