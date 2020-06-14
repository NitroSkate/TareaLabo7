package com.uca.ejemplo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.ejemplo.dao.EstudianteDAO;
import com.uca.ejemplo.domain.Estudiante;
import com.uca.ejemplo.repositories.EstudianteRepo;

@Service
public class EstudianteServiceImpl implements EstudianteService{
	
	@Autowired
	EstudianteRepo eRepo;
	//EstudianteDAO eDao;

	@Override
	public List<Estudiante> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return eRepo.findAll();
	}

	@Override
	public Estudiante findOne(Integer code) throws DataAccessException {
		// TODO Auto-generated method stub
		return eRepo.getOne(code);
	}

	@Override
	@Transactional
	public void insert(Estudiante estudiante) throws DataAccessException {
		// TODO Auto-generated method stub
		eRepo.save(estudiante);
	}

	@Override
	@Transactional
	public void delete(Integer id) throws DataAccessException {
		// TODO Auto-generated method stub
		eRepo.deleteById(id);
	}

	
	
}
