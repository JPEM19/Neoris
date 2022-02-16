package com.neoris.response;

import com.neoris.entity.Saludo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SaludoResponse {

	private Long id; 
	
	private String tipo;
	
	private String saludo;

	public SaludoResponse(Saludo saludo) {
		this.id = saludo.getId();
		this.tipo = saludo.getTipo();
		this.saludo = saludo.getSaludo();
	}
	
	
	
}
