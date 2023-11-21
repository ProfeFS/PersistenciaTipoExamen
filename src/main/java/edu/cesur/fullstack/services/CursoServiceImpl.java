package edu.cesur.fullstack.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cesur.fullstack.dtos.CursoDTO;
import edu.cesur.fullstack.mappers.CursoMapper;
import edu.cesur.fullstack.persistence.repositories.CursoRepository;

@Service
public class CursoServiceImpl implements CursoService {

	@Autowired
	public CursoRepository cursoRepository;
	@Autowired
	public CursoMapper cursoMapper;
	

	@Override
	public CursoDTO createCourse(CursoDTO cursoDTO) {

		return cursoMapper.toDto(cursoRepository.save(cursoMapper.toEntity(cursoDTO)));
	}


}
