package com.sivarbcfans.sivarstats.model;

import jakarta.persistence.*;

@Entity
public class EquipoRival {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEquipoRival;

    private String nombreEquipo;
    private String ciudadSede;
    
    public Integer getIdEquipoRival() {
        return idEquipoRival;
    }
    public void setIdEquipoRival(Integer idEquipoRival) {
        this.idEquipoRival = idEquipoRival;
    }
    public String getNombreEquipo() {
        return nombreEquipo;
    }
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    public String getCiudadSede() {
        return ciudadSede;
    }
    public void setCiudadSede(String ciudadSede) {
        this.ciudadSede = ciudadSede;
    }

    
}
