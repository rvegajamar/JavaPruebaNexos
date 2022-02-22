package com.nexos.prueba.models;

import javax.persistence.*;

@Entity
@Table(name = "CARGO") 
@IdClass(value=CargoPK.class)
public class Cargo {

	@Id
	@Column(name="COD_CARGO")
	private Integer codigoCargo;
	
	@Column(name="NOMBRE")
	private String nombreCargo;

	public Cargo() {
		super();
	}

	public Cargo(Integer codigoCargo, String nombreCargo) {
		super();
		this.codigoCargo = codigoCargo;
		this.nombreCargo = nombreCargo;
	}

	public Integer getCodigoCargo() {
		return codigoCargo;
	}

	public void setCodigoCargo(Integer codigoCargo) {
		this.codigoCargo = codigoCargo;
	}

	public String getNombreCargo() {
		return nombreCargo;
	}

	public void setNombreCargo(String nombreCargo) {
		this.nombreCargo = nombreCargo;
	}
	
	
}
