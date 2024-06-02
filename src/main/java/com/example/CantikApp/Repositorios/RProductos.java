
package com.example.CantikApp.Repositorios;

import com.example.CantikApp.Entidades.Productos;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProductos extends JpaRepository<Productos, Integer>{
    public abstract ArrayList<Productos> findByCategoria(String categoria);
    
}
