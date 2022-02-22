package com.nexos.prueba.repositories;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nexos.prueba.models.Usuario;
import com.nexos.prueba.models.UsuarioPK;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, UsuarioPK>{
	
	@Query("Select a "
			+ "From Usuario a ")
	public List<Usuario> getUsuarios();
	
	@Query(value="insert into usuario (nombre, edad, cod_cargo, fecha_ingreso_usuario, cargo) values (:nombre,:edad,:cod_cargo, :fecha, :cargo) returning nombre ",  nativeQuery = true)
	public String insertUsuarios(@Param("nombre") String nombre,@Param("edad") Integer edad,@Param("cod_cargo") Integer cod_cargo,
			                     @Param("fecha") Date fecha, @Param("cargo") String cargo);
	
	
	

}
