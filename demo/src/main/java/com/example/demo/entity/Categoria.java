package com.example.demo.entity;

import javax.persistence.*;
@Entity
@Table(name="BACATEGO")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cat_id;
	private String cat_nombre;
	private String cat_descripcion;
	
	public Categoria(){
		
	}

	public Categoria(int cat_id, String cat_nombre, String cat_descripcion) {
		super();
		this.cat_id = cat_id;
		this.cat_nombre = cat_nombre;
		this.cat_descripcion = cat_descripcion;
	}

	public int getCat_id() {
		return cat_id;
	}

	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}

	public String getCat_nombre() {
		return cat_nombre;
	}

	public void setCat_nombre(String cat_nombre) {
		this.cat_nombre = cat_nombre;
	}

	public String getCat_descripcion() {
		return cat_descripcion;
	}

	public void setCat_descripcion(String cat_descripcion) {
		this.cat_descripcion = cat_descripcion;
	}
	
	

}
