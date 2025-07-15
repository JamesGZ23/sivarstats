package com.sivarbcfans.sivarstats.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.sivarbcfans.sivarstats.model.Jugador;
import com.sivarbcfans.sivarstats.repository.JugadorRepository;

@Service
public class JugadorService {

    private final JugadorRepository jugadorRepository;

    public JugadorService(JugadorRepository jugadorRepository) {
        this.jugadorRepository = jugadorRepository;
    }

    public List<Jugador> listarTodos() {
        return jugadorRepository.findAll();
    }

    public Optional<Jugador> buscarPorId(Integer id) {
        return jugadorRepository.findById(id);
    }

    public Jugador guardar(Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    public void eliminarPorId(Integer id) {
        jugadorRepository.deleteById(id);
    }
}
