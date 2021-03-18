package com.example.repositorio;


import com.example.ac1.entities.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface clienterepositorio extends JpaRepository<cliente, Long>{
  
}
