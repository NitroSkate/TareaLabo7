package com.uca.ejemplo.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.ejemplo.domain.Estudiante;

public interface EstudianteDAO {
	
	public List<Estudiante>findAll() throws DataAccessException;
	public Estudiante findOne(Integer code) throws DataAccessException;
	public void insert(Estudiante estudiante) throws DataAccessException;
	public void delete(Integer id) throws DataAccessException;
}
