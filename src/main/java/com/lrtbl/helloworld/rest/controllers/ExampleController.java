package com.lrtbl.helloworld.rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class ExampleController {

    @GetMapping
    public String helloWorld () {
        return "hola mundo";
    }
}
