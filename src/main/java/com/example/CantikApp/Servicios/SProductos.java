/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.CantikApp.Servicios;

import com.example.CantikApp.Entidades.Productos;
import com.example.CantikApp.Repositorios.RProductos;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Monse
 */
@Service
public class SProductos {
     @Autowired
    RProductos rProd;
     //Listar los registros de mi tabla
    
    public List<Productos> mtObtenerProductos(){
    return rProd.findAll();
    }
    
    //Insertar datos
    public boolean mtInsertarProducto(Productos rp){
    boolean resp=false;
    try{
        rProd.save((rp));
    }
    catch(Exception e){
        resp=false;  
    }
    return resp;
    }
    
    //Actualizar datos
    public void mtActualizarProducto(Productos rp) {
        rProd.save((rp));
      
    }
    //Obtener un dato
    
    public Productos mtObtenerProd(Integer idP){
        return rProd.getOne(idP);
        
    }
    //Eliminar 
    public void mtEliminarProd(Integer idP){
        rProd.deleteById(idP);
        
    }
    //FILTRAR POR CATEGORIA
    public  ArrayList<Productos> mtFiltarCat(String categoria){
    return rProd.findByCategoria(categoria);
            }
    
}
