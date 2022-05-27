package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Producto;
import com.example.demo.repository.ProductoRepository;


@Service
public class ProductoService {
	
	@Autowired
	ProductoRepository productoRepository;
	
	public ArrayList<Producto> ListarProducto(){
		return (ArrayList<Producto>) productoRepository.findAll();
	}
	
	public Optional<Producto> ProductoById(int pro_id) {
		return productoRepository.findById(pro_id);
	}
	
	public Producto NuevoProducto (Producto pro_util) {
		return productoRepository.save(pro_util);
	}
	
	public Producto ActualizarProducto (Producto pro_util) {
		return productoRepository.save(pro_util);
	}
	
	public boolean EliminarProducto (int pro_id) {
		try {
			productoRepository.deleteById(pro_id);
			return true;
		}
		catch(Exception err){
			return false;
		}
	}

}
