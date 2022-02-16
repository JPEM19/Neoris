package com.neoris.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neoris.entity.Saludo;

@Repository
public interface SaludoRepository extends JpaRepository<Saludo, Long>{

	List<Saludo> findByTipo(String tipo);
	
}
