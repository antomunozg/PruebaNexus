package com.mercancia.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "producto")
public class Producto{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nombre;
	private int cantidad;
	private Date fechaIngreso;
	
	//@ManyToOne
	//@JoinColumn(name = "usuario", referencedColumnName = "id")
	//private Usuario usuario;
	
	
	public Producto() {
	}
	
	public Producto(String nombre, int cantidad, Date fechaIngreso, Usuario usuario) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.fechaIngreso = fechaIngreso;
		//this.usuario = usuario;
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

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
/*
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	*/

}
