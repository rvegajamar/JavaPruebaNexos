package com.nexos.prueba.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.nexos.prueba.models.MercanciaDetalle;
import com.nexos.prueba.models.MercanciaDetallePK;
import com.nexos.prueba.models.MercanciaEncabezado;
import com.nexos.prueba.models.MercanciaEncabezadoPK;

public interface MercanciaDetalleRepository extends CrudRepository<MercanciaDetalle, MercanciaDetallePK>{
	
	@Query("Select a "
			+ "From MercanciaDetalle a ")
	public List<MercanciaDetalle> getMovimiento();
	
	@Query(value=" insert into mercancia_det (cod_mercancia, fecha_movimiento, observacion, cantidad_vendida, proceso, almacen, concepto, proveedor) values	\r\n"
			+ " (:codigoMercancia,:fechaMovimiento,:observacion,:cantidad_vendida, :proceso, :almacen, :concepto, :proveedor) returning observacion",  nativeQuery = true)
	public String guardarMovimiento(@Param("codigoMercancia") Integer cod_mercancia, @Param("fechaMovimiento") Date fecha_movimiento, 
								  @Param("observacion") String observacion, @Param("cantidad_vendida") Integer cantidad_vendida,
			                      @Param("proceso") String proceso, @Param("almacen") String almacen,
			                      @Param("concepto") String concepto, @Param("proveedor") String proveedor);
	
}
