

package com.example.CantikApp.Servicios;

import com.example.CantikApp.Entidades.lServicios;
import com.example.CantikApp.Repositorios.repServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class servLServicios {
    @Autowired
    repServicio rpServ;
    
    //Listar los registros de mi tabla
    
    public List<lServicios> mtObtenerRegistros(){
    return rpServ.findAll();
    }
    
    //Insertar datos
    public boolean mtInsertarRegistros(lServicios rsv){
    boolean resp=false;
    try{
        rpServ.save((rsv));
    }
    catch(Exception e){
        resp=false;  
    }
    return resp;
    }
    
    //Actualizar datos
    public void mtActualizarRegistros(lServicios rsv) {
        rpServ.save((rsv));
      
    }
    //Obtener un dato
    
    public lServicios mtObtenerUnServ(Integer nId){
        return rpServ.getOne(nId);
        
    }
    //Eliminar un estudiante
    public void mtEliminar(Integer nId){
        rpServ.deleteById(nId);
        
    }
    
  
}
