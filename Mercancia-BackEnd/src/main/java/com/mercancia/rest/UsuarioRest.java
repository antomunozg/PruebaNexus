package com.mercancia.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mercancia.model.Usuario;
import com.mercancia.service.UsuarioService;

@RestController
@RequestMapping("/usuario/")
public class UsuarioRest {
	
	@Autowired
	private UsuarioService service;
	
	@GetMapping
	private ResponseEntity<List<Usuario>> getAllUsuarios(){
		return ResponseEntity.ok(service.findAll());
	}
	
	@GetMapping("{id}")
	private ResponseEntity<Usuario> getAllUsuarioById(@PathVariable("id") Long nId){
		return ResponseEntity.ok(service.findById(nId).get());
	}

}
