package com.example.CantikApp.Entidades;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="registros")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Registros {
    @Id
    private int nFolio;
    @Column(length=30)
    private String snombreReg;
    private String sdescserv;
    private int ncosto;

    public int getnFolio() {
        return nFolio;
    }

    public void setnFolio(int nFolio) {
        this.nFolio = nFolio;
    }

    public String getSnombreReg() {
        return snombreReg;
    }

    public void setSnombreReg(String snombreReg) {
        this.snombreReg = snombreReg;
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

    public Registros(int nFolio, String snombreReg, String sdescserv, int ncosto) {
        this.nFolio = nFolio;
        this.snombreReg = snombreReg;
        this.sdescserv = sdescserv;
        this.ncosto = ncosto;
    }

    public Registros() {
    }

    
}