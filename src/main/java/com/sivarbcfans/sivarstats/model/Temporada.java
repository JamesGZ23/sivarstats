package com.sivarbcfans.sivarstats.model;

import jakarta.persistence.*;

@Entity
public class Temporada {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTemporada;

    private Integer año;
    private String codigoTemporada;

        public Integer getIdTemporada() {
        return idTemporada;
    }
    public void setIdTemporada(Integer idTemporada) {
        this.idTemporada = idTemporada;
    }
    public Integer getAño() {
        return año;
    }
    public void setAño(Integer año) {
        this.año = año;
    }
    public String getCodigoTemporada() {
        return codigoTemporada;
    }
    public void setCodigoTemporada(String codigoTemporada) {
        this.codigoTemporada = codigoTemporada;
    }
}

