package com.tienda.emiliano.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tienda.emiliano.model.Usuario;
@Repository
public interface UsuarioRepositoy extends JpaRepository <Usuario,Integer> {
	
}

