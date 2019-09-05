package com.milunas.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartEndpoint {
    @GetMapping
    String starter() {
        return "start from there";
    }
}
