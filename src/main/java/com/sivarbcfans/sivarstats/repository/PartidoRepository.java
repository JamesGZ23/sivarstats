package com.sivarbcfans.sivarstats.repository;

import com.sivarbcfans.sivarstats.model.Partido;
import org.springframework.data.jpa.repository.JpaRepository;

// Partidos
public interface PartidoRepository extends JpaRepository<Partido, Integer> {}