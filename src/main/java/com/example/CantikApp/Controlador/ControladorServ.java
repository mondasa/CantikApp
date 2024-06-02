package com.example.CantikApp.Controlador;

import com.example.CantikApp.Entidades.lServicios;
import com.example.CantikApp.Servicios.servLServicios;
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
@RequestMapping("/registrosServ")
public class ControladorServ {
@Autowired
servLServicios svServicios;
//Obtener los datos
@GetMapping("")
public List<lServicios> getRegistrosS(){
return svServicios.mtObtenerRegistros();
        }
 @PostMapping("")
    public List<lServicios>postInsertarRegistro(@RequestBody lServicios rsv){
        if(svServicios.mtInsertarRegistros(rsv)){
            return svServicios.mtObtenerRegistros();  
        }else{
        return null; 
        }      
    }
    @PutMapping("")
   public void putRegistro(@RequestBody lServicios rsv ){
       svServicios.mtActualizarRegistros(rsv);
   
   }
     @GetMapping("/{nId}")
     public lServicios obtServ(@PathVariable("nId")Integer nId){
         return svServicios.mtObtenerUnServ(nId);
     }
     @DeleteMapping("/{nId}")
    public void mEliminar(@PathVariable("nId")Integer nId){
        svServicios.mtEliminar(nId);
        
    }
}


