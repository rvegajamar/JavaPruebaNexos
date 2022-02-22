package com.nexos.prueba.repositories;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.nexos.prueba.models.MercanciaEncabezado;
import com.nexos.prueba.models.MercanciaEncabezadoPK;

public interface MercanciaEncabezadoRepository extends CrudRepository<MercanciaEncabezado, MercanciaEncabezadoPK>{
	
	@Query("Select a "
			+ "From MercanciaEncabezado a ")
	public List<MercanciaEncabezado> getMercancia();
	
	@Query(value=" insert into mercancia_enc (cod_mercancia, nombre_mercancia, cantidad, fecha_ingreso, usuario_crea, usuario_modifica, estado) values	\r\n"
			+ " (:codigoMercancia,:nombreMercancia,:cantidad,:fechaIngreso,:usuarioCrea, :usuarioModifica,'D') returning usuario_crea",  nativeQuery = true)
	public String insertMercancia(@Param("codigoMercancia") Integer cod_mercancia, @Param("nombreMercancia") String nombre_mercancia, @Param("cantidad") Integer cantidad,  @Param("fechaIngreso") Date fecha_ingreso,
			                      @Param("usuarioCrea") String usuario_crea,  @Param("usuarioModifica") String usuario_modifica);
	

	@Query(value=" select count(1) from mercancia_enc where	\r\n"
			+ "UPPER(nombre_mercancia) = UPPER(':nombre_mercancia')",  nativeQuery = true)
	
	List<Object[]> verificarNombre(@Param("nombre_mercancia") String nombre_mercancia);

}
