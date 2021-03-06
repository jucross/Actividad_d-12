package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Producto;
import com.example.demo.repository.VentasRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/venta")
public class VentaController {
	
	@Autowired
	VentasRepository ventasService;
	
	@ApiOperation(value = "Listar todos los Productos")
	@GetMapping()
	public ArrayList<Producto> ListarProducto(){
		return ventasService.ListarProductos();
	}

}
