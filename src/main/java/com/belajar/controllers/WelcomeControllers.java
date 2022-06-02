package com.belajar.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mobile")
public class WelcomeControllers {

    @GetMapping
    public String index(){
        return "Welcome mans";
    }

    @PostMapping
    public String addData(){
        return "Tambah data";
    }
}
