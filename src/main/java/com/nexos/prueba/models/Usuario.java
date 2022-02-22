package com.nexos.prueba.models;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "USUARIO") 
@IdClass(value=UsuarioPK.class)
public class Usuario  {

	@Id
	@Column(name="ID_USUARIO")
	private Integer idUsuario;
	
	@Column(name="COD_CARGO")
	private Integer codigoCargo;
	
	@Column(name="CARGO")
	private String nombreCargo;
	
	@Column(name="NOMBRE")
	private String nombreUsuario;
	
	@Column(name="EDAD")
	private Integer edad;
	
	@Column(name="FECHA_INGRESO_USUARIO")
	private Date fechaIngresoUsuario;
	
	

	public Usuario() {
		super();
	}

	public Usuario(Integer idUsuario, Integer codigoCargo, String nombreCargo, String nombreUsuario, Integer edad,
			Date fechaIngresoUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.codigoCargo = codigoCargo;
		this.nombreCargo = nombreCargo;
		this.nombreUsuario = nombreUsuario;
		this.edad = edad;
		this.fechaIngresoUsuario = fechaIngresoUsuario;
	}



	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreCargo() {
		return nombreCargo;
	}

	public void setNombreCargo(String nombreCargo) {
		this.nombreCargo = nombreCargo;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Date getFechaIngresoUsuario() {
		return fechaIngresoUsuario;
	}

	public void setFechaIngresoUsuario(Date fechaIngresoUsuario) {
		this.fechaIngresoUsuario = fechaIngresoUsuario;
	}

	public Integer getCodigoCargo() {
		return codigoCargo;
	}

	public void setCodigoCargo(Integer codigoCargo) {
		this.codigoCargo = codigoCargo;
	}
		
}
