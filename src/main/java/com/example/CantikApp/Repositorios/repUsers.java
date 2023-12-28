package com.example.CantikApp.Repositorios;


import com.example.CantikApp.Entidades.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repUsers extends JpaRepository<Usuarios, Integer> {
    
}