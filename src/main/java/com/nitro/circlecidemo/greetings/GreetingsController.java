package com.nitro.circlecidemo.greetings;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    @GetMapping("/")
    public String greetings(){
        return "Hello World";
    }
}
