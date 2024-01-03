package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String getWelComeMethod() {
        return "Hello World!";
    }

    @GetMApping("/name")
    public String getName() {
        return "Hi Nagaraju. You will get the job in future";
    }
}