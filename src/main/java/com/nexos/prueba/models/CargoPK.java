package com.nexos.prueba.models;

import java.io.Serializable;


public class CargoPK implements Serializable{

	private Integer codigoCargo;
	
	public CargoPK() {
		super();
	}

	public CargoPK(Integer codigoCargo) {
		super();
		this.codigoCargo = codigoCargo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoCargo == null) ? 0 : codigoCargo.hashCode());
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
		CargoPK other = (CargoPK) obj;
		if (codigoCargo == null) {
			if (other.codigoCargo != null)
				return false;
		} else if (!codigoCargo.equals(other.codigoCargo))
			return false;
		return true;
	}
	
	
}
