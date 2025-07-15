package com.sivarbcfans.sivarstats.model;

import jakarta.persistence.*;

@Entity
public class Estadisticas {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEstadistica;

    private Integer partidosJugados;
    private Double minutosJugados;
    private Integer puntosConvertidos;
    private Integer triples;
    private Integer rebotes;
    private Integer asistencias;
    private Integer robos;
    private Integer tapones;

    @ManyToOne
    @JoinColumn(name = "id_jugador")
    private Jugador jugador;

    @ManyToOne
    @JoinColumn(name = "id_temporada")
    private Temporada temporada;

    public Integer getIdEstadistica() {
        return idEstadistica;
    }

    public void setIdEstadistica(Integer idEstadistica) {
        this.idEstadistica = idEstadistica;
    }

    public Integer getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(Integer partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public Double getMinutosJugados() {
        return minutosJugados;
    }

    public void setMinutosJugados(Double minutosJugados) {
        this.minutosJugados = minutosJugados;
    }

    public Integer getPuntosConvertidos() {
        return puntosConvertidos;
    }

    public void setPuntosConvertidos(Integer puntosConvertidos) {
        this.puntosConvertidos = puntosConvertidos;
    }

    public Integer getTriples() {
        return triples;
    }

    public void setTriples(Integer triples) {
        this.triples = triples;
    }

    public Integer getRebotes() {
        return rebotes;
    }

    public void setRebotes(Integer rebotes) {
        this.rebotes = rebotes;
    }

    public Integer getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(Integer asistencias) {
        this.asistencias = asistencias;
    }

    public Integer getRobos() {
        return robos;
    }

    public void setRobos(Integer robos) {
        this.robos = robos;
    }

    public Integer getTapones() {
        return tapones;
    }

    public void setTapones(Integer tapones) {
        this.tapones = tapones;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Temporada getTemporada() {
        return temporada;
    }

    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }

    
}
