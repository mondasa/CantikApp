package com.example.CantikApp.Servicios;
import com.example.CantikApp.Entidades.Usuarios;
import com.example.CantikApp.Repositorios.repUsers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class servUsuarios {
    @Autowired
    repUsers rpUsers;
    
    //Listar los registros de mi tabla
    
    public List<Usuarios> mtObtenerUsuarios(){
    return rpUsers.findAll();
    }
    
    //Insertar datos
    public boolean mtInsertarUsuario(Usuarios ruser){
    boolean resp=false;
    try{
        rpUsers.save((ruser));
    }
    catch(Exception e){
        resp=false;  
    }
    return resp;
    }
    
    //Actualizar datos
    public void mtActualizarUsuario(Usuarios ruser) {
        rpUsers.save((ruser));
      
    }
    //Obtener un dato
    
    public Usuarios mtObtenerUsuario(Integer nIdUser){
        return rpUsers.getOne(nIdUser);
        
    }
    //Eliminar un estudiante
    public void mtEliminarUsuario(Integer nIdUser){
        rpUsers.deleteById(nIdUser);
        
    }
  public boolean authenticate(String username, String password) {

        return username.equals("MDASA") && password.equals("mdc");
    }
     
    
    
    
}
