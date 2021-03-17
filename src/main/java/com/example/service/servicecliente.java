package com.example.service;




import java.util.List;

import com.example.ac1.entities.cliente;
import com.example.repositorio.clienterepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class servicecliente {
    
    @Autowired
    private clienterepositorio repository;


    public List<cliente> getcliente()
    {
        List<cliente> list = repository.getcliente();
        return list;
}
}