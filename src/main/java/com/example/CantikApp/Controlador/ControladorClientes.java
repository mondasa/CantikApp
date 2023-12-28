package com.example.CantikApp.Controlador;

import com.example.CantikApp.Entidades.Clientes;
import com.example.CantikApp.Servicios.servClientes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Clientes")
public class ControladorClientes {
    @Autowired
   servClientes svClientes;
    //Obtener los datos
@GetMapping("")
public List<Clientes> getRegistrosS(){
return svClientes.mtObtenerClientes();
        }
 @PostMapping("")
    public List<Clientes>postInsertarRegistro(@RequestBody Clientes rcli){
        if(svClientes.mtInsertarCliente(rcli)){
            return svClientes.mtObtenerClientes();  
        }else{
        return null; 
        }      
    }
    @PutMapping("")
   public void putRegistro(@RequestBody Clientes rcli ){
       svClientes.mtActualizarCliente(rcli);
   
   }
     @GetMapping("/{nIdCli}")
     public Clientes obtServ(@PathVariable("nIdCli")Integer nIdCli){
         return svClientes.mtObtenerCliente(nIdCli);
     }
     @DeleteMapping("/{nIdCli}")
    public void mEliminar(@PathVariable("nIdCli")Integer nIdCli){
        svClientes.mtEliminarCliente(nIdCli);
        
    }
}

