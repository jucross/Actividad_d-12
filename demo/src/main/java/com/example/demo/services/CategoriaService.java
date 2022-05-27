package com.example.demo.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Categoria;
import com.example.demo.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	public ArrayList<Categoria> ListarCategoria(){
		return (ArrayList<Categoria>) categoriaRepository.findAll();
	}
	
	public Optional<Categoria> CategoriaById(int cat_id) {
		return categoriaRepository.findById(cat_id);
	}
	
	public Categoria NuevaCategoria (Categoria cat_util) {
		return categoriaRepository.save(cat_util);
	}
	
	public Categoria ActualizarCategoria (Categoria cat_util) {
		return categoriaRepository.save(cat_util);
	}
	
	public boolean EliminarCategoria (int cat_id) {
		try {
			categoriaRepository.deleteById(cat_id);
			return true;
		}
		catch(Exception err){
			return false;
		}
	}

}
