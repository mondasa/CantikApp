/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.CantikApp.Repositorios;

import com.example.CantikApp.Entidades.Gastos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Monse
 */
@Repository
public interface gastos extends JpaRepository<Gastos, Integer>{
    
}
