package com.example.CantikApp.Entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="servicios")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class lServicios {
    @Id
    private int nId;
    @Column(length=30)
    private String snombreserv;
    private String scliente;
    private String sdescserv;
    private int ncosto;
    private String sdireserv;
    private String sfecha;
    private String sestado;

    public lServicios(int nId, String snombreserv, String scliente, String sdescserv, int ncosto, String sdireserv, String sfecha, String sestado) {
        this.nId = nId;
        this.snombreserv = snombreserv;
        this.scliente = scliente;
        this.sdescserv = sdescserv;
        this.ncosto = ncosto;
        this.sdireserv = sdireserv;
        this.sfecha = sfecha;
        this.sestado = sestado;
    }

    public lServicios() {
    }

    public int getnId() {
        return nId;
    }

    public void setnId(int nId) {
        this.nId = nId;
    }

    public String getSnombreserv() {
        return snombreserv;
    }

    public void setSnombreserv(String snombreserv) {
        this.snombreserv = snombreserv;
    }

    public String getScliente() {
        return scliente;
    }

    public void setScliente(String scliente) {
        this.scliente = scliente;
    }

    public String getSdescserv() {
        return sdescserv;
    }

    public void setSdescserv(String sdescserv) {
        this.sdescserv = sdescserv;
    }

    public int getNcosto() {
        return ncosto;
    }

    public void setNcosto(int ncosto) {
        this.ncosto = ncosto;
    }

    public String getSdireserv() {
        return sdireserv;
    }

    public void setSdireserv(String sdireserv) {
        this.sdireserv = sdireserv;
    }

    public String getSfecha() {
        return sfecha;
    }

    public void setSfecha(String sfecha) {
        this.sfecha = sfecha;
    }

    public String getSestado() {
        return sestado;
    }

    public void setSestado(String sestado) {
        this.sestado = sestado;
    }

    
    
    
}
    
    
    

