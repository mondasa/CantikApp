package com.example.CantikApp.Servicios;

import com.example.CantikApp.Entidades.Clientes;
import com.example.CantikApp.Repositorios.repClientes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class servClientes {
    @Autowired
    repClientes rpClientes;
    
    //Listar los registros de mi tabla
    
    public List<Clientes> mtObtenerClientes(){
    return rpClientes.findAll();
    }
    
    //Insertar datos
    public boolean mtInsertarCliente(Clientes rcli){
    boolean resp=false;
    try{
        rpClientes.save((rcli));
    }
    catch(Exception e){
        resp=false;  
    }
    return resp;
    }
    
    //Actualizar datos
    public void mtActualizarCliente(Clientes rcli) {
        rpClientes.save((rcli));
      
    }
    //Obtener un dato
    
    public Clientes mtObtenerCliente(Integer nIdCli){
        return rpClientes.getOne(nIdCli);
        
    }
    //Eliminar un estudiante
    public void mtEliminarCliente(Integer nIdCli){
        rpClientes.deleteById(nIdCli);
        
    }
}
