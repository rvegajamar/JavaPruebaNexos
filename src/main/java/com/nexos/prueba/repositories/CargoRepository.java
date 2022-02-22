package com.nexos.prueba.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nexos.prueba.models.Cargo;
import com.nexos.prueba.models.CargoPK;

@Repository
public interface CargoRepository extends CrudRepository<Cargo, CargoPK>{

	@Query("Select a "
			+ "From Cargo a "
			+ "order by a.codigoCargo asc")
	public List<Cargo> getCargos();
	
	@Query(value="insert into cargo (nombre) values (:nombre) returning nombre ",  nativeQuery = true)
	public String insertCargos(@Param("nombre") String nombre);
	
}
