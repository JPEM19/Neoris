package com.neoris.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neoris.entity.Saludo;
import com.neoris.repository.SaludoRepository;
import com.neoris.request.CreateSaludoRequest;
import com.neoris.response.SaludoResponse;
import com.neoris.service.SaludoService;

@RestController
@RequestMapping("/api/saludo/")
public class SaludoController {
	
	@Autowired
	SaludoService saludoService;
	
	@Autowired
	SaludoRepository saludoRepository;
	
	@GetMapping("/getAll")
	public List<Saludo> getAllSaludos(){
		return saludoService.getAllSaludos();
	}

	@GetMapping("/get/{tipo}")
	public List<SaludoResponse> getSaludoByTipo(@PathVariable String tipo) {
		List<Saludo> saludoList = saludoService.getSaludoByTipo(tipo);
		List<SaludoResponse> saludoResponseList = new ArrayList<SaludoResponse>(); 
		
		saludoList.stream().forEach(saludo ->{
			saludoResponseList.add(new SaludoResponse(saludo));
		});
		
		return saludoResponseList;
	}
	
	@PostMapping("/create")
	public SaludoResponse createSaludo(@Valid @RequestBody CreateSaludoRequest createSaludoRequest) {
		
		Saludo saludo = saludoService.createSaludo(createSaludoRequest);
		
		return new SaludoResponse(saludo);
	}
	
}
