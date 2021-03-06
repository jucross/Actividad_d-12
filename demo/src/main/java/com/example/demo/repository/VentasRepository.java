package com.example.demo.repository;

import java.util.ArrayList;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Producto;


@FeignClient(name="venta",url="http://localhost:8080/producto")
public interface VentasRepository {
	
	@GetMapping()
	public ArrayList<Producto> ListarProductos();
}
