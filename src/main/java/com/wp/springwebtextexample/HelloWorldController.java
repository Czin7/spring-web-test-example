package com.wp.springwebtextexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello/{name}")
    public String personalGreeting(@PathVariable(value="name") String name) {
        return "Hello " + name;
    }

    @GetMapping("/hello")
    public String greeting() {
        return "Hello World";
    }

}
