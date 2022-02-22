package com.nexos.prueba.models;

import java.sql.Date;

import javax.persistence.*;

import com.nexos.*;
import javax.persistence.Transient;


@Entity
@Table(name = "MERCANCIA_ENC") 
@IdClass(value=MercanciaEncabezadoPK.class)
public class MercanciaEncabezado {
	
	@Column(name="COD_MERCANCIA")
	private Integer codigoMercancia;
	
	@Id
	@Column(name="ID_MERCANCIA")
	private Integer idMercancia;
	
	@Column(name="NOMBRE_MERCANCIA")
	private String nombreProducto;
	
	@Column(name="CANTIDAD")
	private Integer cantidad;
	
	@Column(name="FECHA_INGRESO")
	private Date fechaIngreso;
	
	@Column(name="USUARIO_CREA")
	private String usuarioCrea;
	
	@Column(name="USUARIO_MODIFICA")
	private String usuarioModifica;
	
	@Column(name="ESTADO")
	private String estado;

	@Column(name="FECHA_MODIFICA")
	private Date fechaModificacion;

	public MercanciaEncabezado() {
		super();
	}

	public MercanciaEncabezado(Integer codigoMercancia, Integer idMercancia, String nombreProducto, Integer cantidad,
			Date fechaIngreso, String usuarioCrea, String usuarioModifica, String estado, Date fechaModificacion) {
		super();
		this.codigoMercancia = codigoMercancia;
		this.idMercancia = idMercancia;
		this.nombreProducto = nombreProducto;
		this.cantidad = cantidad;
		this.fechaIngreso = fechaIngreso;
		this.usuarioCrea = usuarioCrea;
		this.usuarioModifica = usuarioModifica;
		this.estado = estado;
		this.fechaModificacion = fechaModificacion;
	}

	public Integer getCodigoMercancia() {
		return codigoMercancia;
	}

	public void setCodigoMercancia(Integer codigoMercancia) {
		this.codigoMercancia = codigoMercancia;
	}

	public Integer getIdMercancia() {
		return idMercancia;
	}

	public void setIdMercancia(Integer idMercancia) {
		this.idMercancia = idMercancia;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getUsuarioCrea() {
		return usuarioCrea;
	}

	public void setUsuarioCrea(String usuarioCrea) {
		this.usuarioCrea = usuarioCrea;
	}

	public String getUsuarioModifica() {
		return usuarioModifica;
	}

	public void setUsuarioModifica(String usuarioModifica) {
		this.usuarioModifica = usuarioModifica;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	

	
}

