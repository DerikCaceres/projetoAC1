package com.example.ac1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class clientecontroller {

    @GetMapping
    public ResponseEntity<cadastroClient> getcadastroClient()
    {
        cadastroClient 
    }
    
}
