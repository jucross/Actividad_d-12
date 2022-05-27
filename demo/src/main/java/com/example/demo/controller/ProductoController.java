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

import com.example.demo.entity.Producto;
import com.example.demo.services.ProductoService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/producto")
public class ProductoController {
	@Autowired
	ProductoService productoService;
	
	@ApiOperation(value = "Listar todos los Productos")
	@GetMapping()
	public ArrayList<Producto> ListarProducto(){
		return productoService.ListarProducto();
	}
	
	@ApiOperation(value = "Producto por ID")
	@GetMapping(path ="/{id}")
	public Optional<Producto> ProductoById(@PathVariable("id") Integer id){
		return this.productoService.ProductoById(id);
		
	}
	
	@ApiOperation(value = "Añadir producto")
	@PostMapping()
	public Producto NuevoProducto(@RequestBody Producto cuenta_util) {
		return this.productoService.NuevoProducto(cuenta_util);
	}
	
	@ApiOperation(value = "Actualizar producto")
	@PutMapping(path = "/{id}")
	public Producto ActualizarProducto(@PathVariable("id") Integer id, @RequestBody Producto pro_util) {
		pro_util.setPro_id(id);
		return this.productoService.ActualizarProducto(pro_util);
	}
	
	@ApiOperation(value = "Actualizacion Parcial")
	@PatchMapping(path = "/{id}")
	public Producto ActualizarParcialProducto(@PathVariable("id") Integer id, @RequestBody Producto pro_util) {
		pro_util.setPro_id(id);
		return this.productoService.ActualizarProducto(pro_util);
	}
	
	@ApiOperation(value = "Eliminar Producto")
	@DeleteMapping(path = "/{id}")
	public Boolean EliminarProducto (@PathVariable("id") Integer id) {
		return this.productoService.EliminarProducto(id);
		
	}

}
