package com.darek1024.dockerdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String hello(@RequestParam Optional<String> name) {
        return name.map(n -> "Hello " + n + "!").orElse("Hello, World!");
    }

}
