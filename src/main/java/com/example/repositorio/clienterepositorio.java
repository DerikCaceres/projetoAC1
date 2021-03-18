package com.example.repositorio;

import java.util.ArrayList;
import java.util.List;

import com.example.ac1.entities.cliente;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository

public interface clienterepositorio extends JpaRepository<cliente, Long>{
  
}
