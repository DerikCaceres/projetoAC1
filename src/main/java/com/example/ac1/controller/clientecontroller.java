package com.example.ac1.controller;

import com.example.ac1.entities.cliente;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class clientecontroller {

    @GetMapping
    public ResponseEntity<cliente> getcliente()
    {
        cliente c = new cliente(); 
        c.setId(1l);
        c.setName("derik");
        c.setEmail("derik.maganhato@hotmail.com");
        c.setLugar("sorocaba");
        c.setDescricao("lindo");

        return ResponseEntity.ok().body(c);
    }
    
}
