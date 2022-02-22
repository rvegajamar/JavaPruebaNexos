package com.nexos.prueba.services;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.nexos.prueba.models.MercanciaDetalle;
import com.nexos.prueba.repositories.MercanciaDetalleRepository;

@Service
public class MercanciaDetalleService {
	@Autowired
	private MercanciaDetalleRepository repository;


	public List<MercanciaDetalle> guardarMovimiento(MercanciaDetalle movimiento){
		java.util.Date fecha = new Date();
		movimiento.setFechaMovimientoMercancia(fecha);
		repository.guardarMovimiento(movimiento.getCodMercancia(), movimiento.getFechaMovimientoMercancia(),
				movimiento.getObservacion(),movimiento.getCantidad_vendida(),movimiento.getProceso(),movimiento.getAlmacen(), movimiento.getConcepto(), movimiento.getProveedor());
		return repository.getMovimiento();
	}
	
	
	public List<MercanciaDetalle> obtenerMovimientos(){
		return repository.getMovimiento();
	}
	

}
