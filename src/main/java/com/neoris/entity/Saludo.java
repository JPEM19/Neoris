package com.neoris.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.neoris.request.CreateSaludoRequest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="saludos")
public class Saludo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique=true)
	private Long id; 
	
	@Column(name="tipo")
	private String tipo;
	
	@Column(name="saludo")
	private String saludo;
	
	public Saludo (CreateSaludoRequest createSaludoRequest) {
		this.tipo = createSaludoRequest.getTipo(); 
		this.saludo = createSaludoRequest.getSaludo();
	}
	
}
