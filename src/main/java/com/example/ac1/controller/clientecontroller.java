package com.example.ac1.controller;

import java.util.List;

import com.example.Dto.Dtocliente;
import com.example.ac1.entities.cliente;
import com.example.service.servicecliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class clientecontroller 
{

    @Autowired
    private servicecliente service;

    @GetMapping
    public ResponseEntity<List<Dtocliente>> getcliente()
    {
        List <Dtocliente> list = service.getcliente();
        return ResponseEntity.ok().body(list);

    }
    
        @GetMapping("{id}")
        public ResponseEntity<Dtocliente>getclienteById(@PathVariable long id)
    {
        Dtocliente dto = service.getclienteById(id);
        return ResponseEntity.ok().body(dto);    
    
    }
    
}
