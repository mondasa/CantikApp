package com.example.CantikApp.Entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="clientes")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Clientes {
    @Id
    private int nIdCli;
    @Column(length=30)
    private String snombrecli;
      private String srfc;
    private String sdirec;
    private String stelc;

    public int getnIdCli() {
        return nIdCli;
    }

    public void setnIdCli(int nIdCli) {
        this.nIdCli = nIdCli;
    }

    public String getSnombrecli() {
        return snombrecli;
    }

    public void setSnombrecli(String snombrecli) {
        this.snombrecli = snombrecli;
    }

    public String getSrfc() {
        return srfc;
    }

    public void setSrfc(String srfc) {
        this.srfc = srfc;
    }

    public String getSdirec() {
        return sdirec;
    }

    public void setSdirec(String sdirec) {
        this.sdirec = sdirec;
    }

    public String getStelc() {
        return stelc;
    }

    public void setStelc(String stelc) {
        this.stelc = stelc;
    }

    public Clientes(int nIdCli, String snombrecli, String srfc, String sdirec, String stelc) {
        this.nIdCli = nIdCli;
        this.snombrecli = snombrecli;
        this.srfc = srfc;
        this.sdirec = sdirec;
        this.stelc = stelc;
    }

    public Clientes() {
    }
  

   
    
}
