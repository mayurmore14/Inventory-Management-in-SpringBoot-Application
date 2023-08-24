package com.igc.iteminventory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invapi")
public class ItemController {

    @GetMapping("/home")
    public String homePage() {
        return "Welcome to Item Api";
    }

    @PostMapping("/additem")
    public String addItem() {
        return "Item Added..";
    }
}
