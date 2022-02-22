package com.nexos.prueba.models;

import java.io.Serializable;

public class MercanciaDetallePK implements Serializable{
	
	private Integer codMercancia;//Este codigo es obligatorio 
	
	public MercanciaDetallePK() {
		super();
	}

	public MercanciaDetallePK(Integer idUsuario, Integer codMercancia) {
		super();
		this.codMercancia = codMercancia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codMercancia == null) ? 0 : codMercancia.hashCode());
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
		MercanciaDetallePK other = (MercanciaDetallePK) obj;
		if (codMercancia == null) {
			if (other.codMercancia != null)
				return false;
		} else if (!codMercancia.equals(other.codMercancia))
			return false;
		return true;
	}
	
	

}
