package com.tienda.emiliano.service;

import java.util.List;

import com.tienda.emiliano.model.Orden;


public interface OrdenService {
	List <Orden>  findAll();
	Orden save (Orden orden); 
	String generarNumeroOrden();
	
}
