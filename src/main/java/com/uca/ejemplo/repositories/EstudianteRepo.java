package com.uca.ejemplo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uca.ejemplo.domain.Estudiante;

public interface EstudianteRepo extends JpaRepository<Estudiante, Integer> {

}
