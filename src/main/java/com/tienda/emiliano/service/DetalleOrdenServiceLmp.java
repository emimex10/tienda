package com.tienda.emiliano.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.emiliano.model.DetalleOrden;
import com.tienda.emiliano.repository.DetalleOrdenRepository;
@Service
public class DetalleOrdenServiceLmp implements DetalleOrdenService {
	 @Autowired
	 private DetalleOrdenRepository detalleOrdenRepository;
	 
	@Override
	public DetalleOrden save(DetalleOrden detalleOrden) {
			return detalleOrdenRepository.save(detalleOrden);
	}

}
