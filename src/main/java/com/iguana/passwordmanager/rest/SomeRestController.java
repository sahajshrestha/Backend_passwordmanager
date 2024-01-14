package com.iguana.passwordmanager.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeRestController {

    @GetMapping
    public String sayHello() {
        return "Hello PM user";
    }
}
