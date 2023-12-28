package com.example.CantikApp.Entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Usuarios {
    @Id
    private int nIdUser;
    @Column(length=30)
    private String suser;
    private String spassword;
    

    public Usuarios() {
    }

    public int getnIdUser() {
        return nIdUser;
    }

    public void setnIdUser(int nIdUser) {
        this.nIdUser = nIdUser;
    }

    public String getSuser() {
        return suser;
    }

    public void setSuser(String suser) {
        this.suser = suser;
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
    }

    public Usuarios(int nIdUser, String suser, String spassword) {
        this.nIdUser = nIdUser;
        this.suser = suser;
        this.spassword = spassword;
    }

    
}
