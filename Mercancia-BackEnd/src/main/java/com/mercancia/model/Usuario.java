package com.mercancia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "usuario")
public class Usuario{
	
	@Id
	private int id;
	
	private String nombre;
	
	public Usuario() {
		
	}
	
	public Usuario(String nombre) {
		super();
		this.nombre = nombre;
	}  
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
