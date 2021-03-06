package com.example.demo.entity;

import javax.persistence.*;
@Entity
@Table(name="BAPRODUC")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pro_id;
	private String pro_nombre;
	private String pro_descripcion;
	private int pro_categoria_id;
	
	public Producto(){}

	public Producto(int pro_id, String pro_nombre, String pro_descripcion, int pro_categoria_id) {
		super();
		this.pro_id = pro_id;
		this.pro_nombre = pro_nombre;
		this.pro_descripcion = pro_descripcion;
		this.pro_categoria_id = pro_categoria_id;
	}

	public int getPro_id() {
		return pro_id;
	}

	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}

	public String getPro_nombre() {
		return pro_nombre;
	}

	public void setPro_nombre(String pro_nombre) {
		this.pro_nombre = pro_nombre;
	}

	public String getPro_descripcion() {
		return pro_descripcion;
	}

	public void setPro_descripcion(String pro_descripcion) {
		this.pro_descripcion = pro_descripcion;
	}

	public int getPro_categoria_id() {
		return pro_categoria_id;
	}

	public void setPro_categoria_id(int pro_categoria_id) {
		this.pro_categoria_id = pro_categoria_id;
	}
}
