package com.nexos.prueba.models;

import java.io.Serializable;

public class MercanciaEncabezadoPK implements Serializable{
	
	private Integer idMercancia;
	
	public MercanciaEncabezadoPK() {
		super();
	}

	public MercanciaEncabezadoPK(Integer idMercancia) {
		super();
		this.idMercancia = idMercancia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idMercancia == null) ? 0 : idMercancia.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MercanciaEncabezadoPK other = (MercanciaEncabezadoPK) obj;
		if (idMercancia == null) {
			if (other.idMercancia != null)
				return false;
		} else if (!idMercancia.equals(other.idMercancia))
			return false;
		return true;
	}

	

}
