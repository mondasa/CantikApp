package com.example.CantikApp.Servicios;

import com.example.CantikApp.Entidades.Registros;
import com.example.CantikApp.Repositorios.repRegistros;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class servRegistros {
    @Autowired
    repRegistros rReg;
    
     public List<Registros> mtObtenerRegistros(){
    return rReg.findAll();
    }
    
    //Insertar datos
    public boolean mtInsertarRegistros(Registros rsv){
    boolean resp=false;
    try{
        rReg.save((rsv));
    }
    catch(Exception e){
        resp=false;  
    }
    return resp;
    }
    
    //Actualizar datos
    public void mtActualizarRegistros(Registros rsv) {
        rReg.save((rsv));
      
    }
    //Obtener un dato
    
    public Registros mtObtenerUnServ(Integer nFolio){
        return rReg.getOne(nFolio);
        
    }
    //Eliminar un estudiante
    public void mtEliminar(Integer nFolio){
        rReg.deleteById(nFolio);
        
    }
}

