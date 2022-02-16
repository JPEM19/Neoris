package com.neoris.request;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateSaludoRequest {

	@NotBlank(message = "tipo es requerido")
	private String tipo; 
	
	@NotBlank(message = "saludo es requerido")
	private String saludo; 
	
}
