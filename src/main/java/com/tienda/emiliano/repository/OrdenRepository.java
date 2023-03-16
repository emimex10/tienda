package com.tienda.emiliano.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.tienda.emiliano.model.Orden;

@Repository
@Service
public interface OrdenRepository extends JpaRepository<Orden, Integer> {
	
}
