package com.example.CantikApp.Controlador;

import com.example.CantikApp.Entidades.Registros;
import com.example.CantikApp.Servicios.servRegistros;
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
@RequestMapping("/pedidos")
public class ControladorReg {
  @Autowired
servRegistros svRegistros;

@GetMapping("")
public List<Registros> getRegistrosS(){
return svRegistros.mtObtenerRegistros();
        }
 @PostMapping("")
    public List<Registros>postInsertarRegistro(@RequestBody Registros rsv){
        if(svRegistros.mtInsertarRegistros(rsv)){
            return svRegistros.mtObtenerRegistros();  
        }else{
        return null; 
        }      
    }
    @PutMapping("")
   public void putRegistro(@RequestBody Registros rsv ){
       svRegistros.mtActualizarRegistros(rsv);
   
   }
     @GetMapping("/{nFolio}")
     public Registros obtServ(@PathVariable("nFolio")Integer nFolio){
         return svRegistros.mtObtenerUnServ(nFolio);
     }
     @DeleteMapping("/{nFolio}")
    public void mEliminar(@PathVariable("nFolio")Integer nFolio){
        svRegistros.mtEliminar(nFolio);
        
    }  
}


