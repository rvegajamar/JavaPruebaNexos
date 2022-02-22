package com.nexos.prueba.models;


import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "MERCANCIA_DET") 
@IdClass(value=MercanciaDetallePK.class)
public class MercanciaDetalle {
	
	@Id
	@Column(name="COD_MERCANCIA")
	private Integer codMercancia;
	
	@Column(name="FECHA_MOVIMIENTO")
	private Date fechaMovimientoMercancia;
	
	@Column(name="OBSERVACION")
	private String observacion;

	@Column(name="CANTIDAD_VENDIDA")
	private Integer cantidad_vendida;
	
	@Column(name="PROCESO")
	private String proceso;
	
	@Column(name="ALMACEN")
	private String almacen;
	
	@Column(name="CONCEPTO")
	private String concepto;
	
	@Column(name="PROVEEDOR")
	private String proveedor;
	

	public MercanciaDetalle(Integer idUsuario, Integer codigoMercancia, Date fechaMovimientoMercancia,
			String observacion, Integer cantidad_vendida ,String proceso, String almacen, String concepto, String proveedor) {
		super();
		this.codMercancia = codigoMercancia;
		this.fechaMovimientoMercancia = fechaMovimientoMercancia;
		this.observacion = observacion;
		this.cantidad_vendida = cantidad_vendida;
		this.proceso = proceso;
		this.almacen = almacen;
		this.concepto = concepto;
		this.proveedor = proveedor;
	}




	public Integer getCodMercancia() {
		return codMercancia;
	}





	public void setCodMercancia(Integer codMercancia) {
		this.codMercancia = codMercancia;
	}





	public Date getFechaMovimientoMercancia() {
		return fechaMovimientoMercancia;
	}





	public void setFechaMovimientoMercancia(Date fechaMovimientoMercancia) {
		this.fechaMovimientoMercancia = fechaMovimientoMercancia;
	}





	public String getObservacion() {
		return observacion;
	}





	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}





	public Integer getCantidad_vendida() {
		return cantidad_vendida;
	}





	public void setCantidad_vendida(Integer cantidad_vendida) {
		this.cantidad_vendida = cantidad_vendida;
	}





	public String getProceso() {
		return proceso;
	}





	public void setProceso(String proceso) {
		this.proceso = proceso;
	}





	public String getAlmacen() {
		return almacen;
	}





	public void setAlmacen(String almacen) {
		this.almacen = almacen;
	}





	public String getConcepto() {
		return concepto;
	}





	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}





	public String getProveedor() {
		return proveedor;
	}





	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}





	public MercanciaDetalle() {
		super();
	}
	
	

	
}
