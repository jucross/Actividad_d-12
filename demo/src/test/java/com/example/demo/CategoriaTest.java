package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.controller.CategoriaController;
import com.example.demo.entity.Categoria;

public class CategoriaTest {

	@Autowired
	private CategoriaController catController;
	
	
	@Test
	public void testListarCategoria() {
		ArrayList<Categoria> categorias = catController.ListarCategoria();
		assertThat(categorias).size().isGreaterThan(0);
	}
	
	@Test
	public void testCategoriaById() {
		Optional<Categoria> categoria = catController.CategoriaById(2);
		assertNotNull(categoria);
	}
	
	@Test
	public void testNuevaCategoria() {
		Categoria nuevaCategoria = catController.NuevaCategoria(new Categoria(10,"Test nombre","Test descripcion"));
		assertThat(nuevaCategoria.getCat_id()).isGreaterThan(0);
	}
	
	@Test
	public void testEliminarCategoria() {
		catController.EliminarCategoria(2);
		Optional<Categoria> categoria = catController.CategoriaById(2);
		assertThat(categoria).isNull();
	}

}
