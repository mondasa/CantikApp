/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.CantikApp.Repositorios;

import com.example.CantikApp.Entidades.Productos;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProductos extends JpaRepository<Productos, Integer>{
    public abstract ArrayList<Productos> findByCategoria(String categoria);
    
}
