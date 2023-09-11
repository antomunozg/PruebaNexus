package com.mercancia.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mercancia.model.Producto;
import com.mercancia.service.ProductoService;

@RestController
@RequestMapping("/producto/")
public class ProductoRest {
	
	@Autowired
	private ProductoService service;
	
	@GetMapping
	private ResponseEntity<List<Producto>> getAllProductos(){
		return ResponseEntity.ok(service.findAll());
	}
	
	
	@PostMapping
	private ResponseEntity<Producto> savePersona (@RequestBody Producto producto){
		try {
			Producto productoGuardado = service.save(producto);		
		return ResponseEntity.created(new URI("/producto/"+productoGuardado.getId())).body(productoGuardado);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deletePersona (@PathVariable ("id") Long id){
		service.deleteById(id);
		return ResponseEntity.ok(!(service.findById(id)!=null));
		
	}
	

}
