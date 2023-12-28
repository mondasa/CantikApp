
package com.example.CantikApp.Repositorios;
import com.example.CantikApp.Entidades.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repClientes extends JpaRepository<Clientes, Integer>{
    
}

