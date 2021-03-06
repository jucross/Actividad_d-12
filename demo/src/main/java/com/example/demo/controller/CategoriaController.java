package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Categoria;
import com.example.demo.services.CategoriaService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
	CategoriaService categoriaService;
	
	
	@ApiOperation(value = "Listar todas las categorias")
	@GetMapping()
	public ArrayList<Categoria> ListarCategoria(){
		return categoriaService.ListarCategoria();
	}
	
	@ApiOperation(value = "Buscar categoria por Id")
	@GetMapping(path ="/{id}")
	public Optional<Categoria> CategoriaById(@PathVariable("id") Integer id){
		return this.categoriaService.CategoriaById(id);
		
	}
	
	@ApiOperation(value = "Agregar Categoria")
	@PostMapping()
	public Categoria NuevaCategoria(@RequestBody Categoria cuenta_util) {
		return this.categoriaService.NuevaCategoria(cuenta_util);
	}
	
	@ApiOperation(value = "Actualizacion total de Categoria")
	@PutMapping(path = "/{id}")
	public Categoria ActualizarCategoria(@PathVariable("id") Integer id, @RequestBody Categoria pro_util) {
		pro_util.setCat_id(id);
		return this.categoriaService.ActualizarCategoria(pro_util);
	}
	
	@ApiOperation(value = "Actualizacion Parcial de Categoria")
	@PatchMapping(path = "/{id}")
	public Categoria ActualizarParcialProducto(@PathVariable("id") Integer id, @RequestBody Categoria pro_util) {
		pro_util.setCat_id(id);
		return this.categoriaService.ActualizarCategoria(pro_util);
	}
	
	@ApiOperation(value = "Eliminar Categoria")
	@DeleteMapping(path = "/{id}")
	public Boolean EliminarCategoria (@PathVariable("id") Integer id) {
		return this.categoriaService.EliminarCategoria(id);
		
	}


}
