
package com.example.CantikApp.Repositorios;

import com.example.CantikApp.Entidades.Registros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repRegistros extends JpaRepository<Registros, Integer> {
    
}
