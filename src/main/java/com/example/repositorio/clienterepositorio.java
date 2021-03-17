package com.example.repositorio;

import java.util.ArrayList;
import java.util.List;

import com.example.ac1.entities.cliente;

import org.springframework.stereotype.Component;

@Component
public class clienterepositorio {
    
    public List<cliente> getcliente()
        {
         cliente c1 = new cliente(); 
        c1.setId(1l);
        c1.setName("derik");
        c1.setEmail("derik.maganhato@hotmail.com");
        c1.setLugar("sorocaba");
        c1.setDescricao("lindo");

        List<cliente> list = new ArrayList<>();
        list.add(c1);
        return list;
        }
}
