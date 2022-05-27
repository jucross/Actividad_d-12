package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.controller.ProductoController;
import com.example.demo.entity.Producto;

public class ProductoTest {

	@Autowired
	private ProductoController proController;
	
	
	@Test
	public void testListarProducto() {
		ArrayList<Producto> productos = proController.ListarProducto();
		assertThat(productos).size().isGreaterThan(0);
	}
	
	@Test
	public void testProductoById() {
		Optional<Producto> producto = proController.ProductoById(2);
		assertNotNull(producto);
	}
	
	@Test
	public void testNuevoProducto() {
		Producto nuevoProducto = proController.NuevoProducto(new Producto(10,"Test nombre","Test descripcion",10));
		assertThat(nuevoProducto.getPro_id()).isGreaterThan(0);
	}
	
	
	@Test
	public void testEliminarProducto() {
		proController.EliminarProducto(2);
		Optional<Producto> producto = proController.ProductoById(2);
		assertThat(producto).isNull();
		
	}

	
	

}
