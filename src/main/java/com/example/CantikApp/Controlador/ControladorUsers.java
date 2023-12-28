package com.example.CantikApp.Controlador;


import com.example.CantikApp.Entidades.Usuarios;
import com.example.CantikApp.Servicios.servUsuarios;
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
@RequestMapping("/users")
public class ControladorUsers {
    @Autowired
   servUsuarios svUsuario;
    //Obtener los datos
@GetMapping("")
public List<Usuarios> getRegistrosS(){
return svUsuario.mtObtenerUsuarios();
        }
 @PostMapping("")
    public List<Usuarios>postInsertarRegistro(@RequestBody Usuarios ruser){
        if(svUsuario.mtInsertarUsuario(ruser)){
            return svUsuario.mtObtenerUsuarios();  
        }else{
        return null; 
        }      
    }
    @PutMapping("")
   public void putRegistro(@RequestBody Usuarios ruser){
       svUsuario.mtActualizarUsuario(ruser);
   
   }
     @GetMapping("/{nIdUser}")
     public Usuarios obtServ(@PathVariable("nIdUser")Integer nIdUser){
         return svUsuario.mtObtenerUsuario(nIdUser);
     }
     @DeleteMapping("/{nIdUser}")
    public void mEliminar(@PathVariable("nIdUser")Integer nIdUser){
        svUsuario.mtEliminarUsuario(nIdUser);
        
    }
    
    //Metodo Login
    
   
}



