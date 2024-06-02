package com.example.CantikApp.Repositorios;

import com.example.CantikApp.Entidades.lServicios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repServicio extends JpaRepository<lServicios, Integer>{
    
}
