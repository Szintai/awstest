package com.szintaik.awsdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {




    @GetMapping("/hello")
    public ResponseEntity<String> hello(){

        return ResponseEntity.ok().body("Helloka");
    }


    @GetMapping("/")
    public ResponseEntity<String> home(){

        return ResponseEntity.ok().body("Helloka");
    }



}
