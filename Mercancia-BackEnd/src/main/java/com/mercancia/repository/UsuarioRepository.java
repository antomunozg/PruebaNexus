package com.mercancia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mercancia.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
