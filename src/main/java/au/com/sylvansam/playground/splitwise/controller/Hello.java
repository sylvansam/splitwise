package au.com.sylvansam.playground.splitwise.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/")
    public String home() {
        return "Hello world";
    }
}
