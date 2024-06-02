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
@RequestMapping("/Productos")
public class CProductos {
    @Autowired
   SProductos svProductos;
    @GetMapping("")
public List<lServicios> getRegistrosS(){
return svProductos.mtObtenerProductos();
        }
 @PostMapping("")
    public List<lServicios>postInsertarRegistro(@RequestBody lServicios rp){
        if(svProductos.mtInsertarProducto(rp)){
            return svProductos.mtObtenerProductos();  
        }else{
        return null; 
        }      
    }
    @PutMapping("")
   public void putRegistro(@RequestBody lServicios rcli ){
       svProductos.mtActualizarProducto(rcli);
   
   }
     @GetMapping("/{idP}")
     public lServicios obtServ(@PathVariable("idP")Integer idP){
         return svProductos.mtObtenerProd(idP);
     }
     @DeleteMapping("/{idP}")
    public void mEliminar(@PathVariable("idP")Integer idP){
        svProductos.mtEliminarProd(idP);
        
    }
    @GetMapping("/query")
    public ArrayList<lServicios> mtFiltarC(@RequestParam("categoria") String categoria){
        return svProductos.mtFiltarCat(categoria);
    
}
    
}


