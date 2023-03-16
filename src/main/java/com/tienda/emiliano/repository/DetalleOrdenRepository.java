package com.tienda.emiliano.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tienda.emiliano.model.DetalleOrden;
@Repository
public interface DetalleOrdenRepository extends JpaRepository<DetalleOrden, Integer> {

}
