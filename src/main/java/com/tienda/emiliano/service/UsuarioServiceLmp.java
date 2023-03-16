package com.tienda.emiliano.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.emiliano.model.Usuario;
import com.tienda.emiliano.repository.UsuarioRepositoy;
@Service
public class UsuarioServiceLmp implements UsuarioService {

	@Autowired
	private UsuarioRepositoy usuarioRepository;

	@Override
	public Optional<Usuario> findById(Integer id) {
		
		return usuarioRepository.findById(id);
	}
	

	
	

}
