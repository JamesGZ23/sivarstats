package com.sivarbcfans.sivarstats.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Partido {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPartido;

    private LocalDate fecha;
    private String localVisitante; // 'Local' o 'Visitante'
    private Integer puntosSivar;
    private Integer puntosRival;
    private String resultado;

    @ManyToOne
    @JoinColumn(name = "id_temporada")
    private Temporada temporada;

    @ManyToOne
    @JoinColumn(name = "id_equipoRival")
    private EquipoRival equipoRival;

    @ManyToOne
    @JoinColumn(name = "id_fase")
    private Fase fase;

    public Integer getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(Integer idPartido) {
        this.idPartido = idPartido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getLocalVisitante() {
        return localVisitante;
    }

    public void setLocalVisitante(String localVisitante) {
        this.localVisitante = localVisitante;
    }

    public Integer getPuntosSivar() {
        return puntosSivar;
    }

    public void setPuntosSivar(Integer puntosSivar) {
        this.puntosSivar = puntosSivar;
    }

    public Integer getPuntosRival() {
        return puntosRival;
    }

    public void setPuntosRival(Integer puntosRival) {
        this.puntosRival = puntosRival;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Temporada getTemporada() {
        return temporada;
    }

    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }

    public EquipoRival getEquipoRival() {
        return equipoRival;
    }

    public void setEquipoRival(EquipoRival equipoRival) {
        this.equipoRival = equipoRival;
    }

    public Fase getFase() {
        return fase;
    }

    public void setFase(Fase fase) {
        this.fase = fase;
    }

    
}

