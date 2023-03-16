package com.tienda.emiliano.service;


import java.util.Optional;

import com.tienda.emiliano.model.Usuario;

public interface UsuarioService {
	Optional <Usuario> findById(Integer id);
}
