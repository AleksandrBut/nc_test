package com.main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @RequestMapping("/hello")
    public String foo() {
        return "Hello, world!";
    }
}
