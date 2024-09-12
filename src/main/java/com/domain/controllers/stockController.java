package com.domain.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/stock")
public class stockController {
    
    @GetMapping
	public String test(){
        return "Test Rest API";
    }
}
