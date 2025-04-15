package com.apicom.example.agenda;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HeloTest {

    @GetMapping("/hello")
    public String hello() {
        return "Olá, mundo!";
    }
}