package com.nexos.prueba.models;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "HISTO_MERCANCIA") 
@IdClass(value=HistoricoMercanciaPK.class)
public class HistoricoMercancia {
	
	@Id
	@Column(name="COD_MERCANCIA")
	private Integer codigoMercancia;
	
	@Id
	@Column(name="MERCANICA_ENC_COD_MERCANCIA")
	private Integer codMercanciaEnc;
	
	@Column(name="ESTADO")
	private String estado;
	
	@Column(name="DESCRIPCION")
	private String descripcion;
	
	@Column(name="FECHA")
	private Date fecha;
		
	public HistoricoMercancia(Integer codigoMercancia, Integer codMercanciaEnc, String estado, String descripcion,
			Date fecha) {
		super();
		this.codigoMercancia = codigoMercancia;
		this.codMercanciaEnc = codMercanciaEnc;
		this.estado = estado;
		this.descripcion = descripcion;
		this.fecha = fecha;
	}

	public Integer getCodigoMercancia() {
		return codigoMercancia;
	}

	public void setCodigoMercancia(Integer codigoMercancia) {
		this.codigoMercancia = codigoMercancia;
	}

	public Integer getCodMercanciaEnc() {
		return codMercanciaEnc;
	}

	public void setCodMercanciaEnc(Integer codMercanciaEnc) {
		this.codMercanciaEnc = codMercanciaEnc;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	

}
