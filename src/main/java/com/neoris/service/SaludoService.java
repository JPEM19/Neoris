package com.neoris.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neoris.entity.Saludo;
import com.neoris.repository.SaludoRepository;
import com.neoris.request.CreateSaludoRequest;
import com.neoris.response.SaludoResponse;

@Service
public class SaludoService {

	@Autowired
	SaludoRepository saludoRepository;
	
	public List<Saludo> getAllSaludos(){
		return saludoRepository.findAll();
	}
	
	public List<Saludo> getSaludoByTipo(String tipo) {
		return saludoRepository.findByTipo(tipo);
	}
	
	public Saludo createSaludo(CreateSaludoRequest createSaludoRequest) {
		Saludo saludo = new Saludo(createSaludoRequest); 
		saludo = saludoRepository.save(saludo); //retorna el ID con el objeto creado en la BD
		
		return saludo;
	}
	
	
}
