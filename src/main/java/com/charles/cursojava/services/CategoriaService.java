package com.charles.cursojava.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.charles.cursojava.domain.Categoria;
import com.charles.cursojava.repositories.CategoriaRepository;
import com.charles.cursojava.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));		
	}
	
	public Categoria insert(Categoria obj){
		obj.setId(null);
		return repo.save(obj);		
	}

	public Categoria update(Categoria obj){
		find(obj.getId());
		return repo.save(obj);		
	}
}
