package com.nexos.prueba.models;

import java.io.Serializable;

public class HistoricoMercanciaPK implements Serializable{
	
	private Integer codigoMercancia;
	private Integer codMercanciaEnc;
	
	public HistoricoMercanciaPK() {
		super();
	}

	public HistoricoMercanciaPK(Integer codigoMercancia, Integer codMercanciaEnc) {
		super();
		this.codigoMercancia = codigoMercancia;
		this.codMercanciaEnc = codMercanciaEnc;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codMercanciaEnc == null) ? 0 : codMercanciaEnc.hashCode());
		result = prime * result + ((codigoMercancia == null) ? 0 : codigoMercancia.hashCode());
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
		HistoricoMercanciaPK other = (HistoricoMercanciaPK) obj;
		if (codMercanciaEnc == null) {
			if (other.codMercanciaEnc != null)
				return false;
		} else if (!codMercanciaEnc.equals(other.codMercanciaEnc))
			return false;
		if (codigoMercancia == null) {
			if (other.codigoMercancia != null)
				return false;
		} else if (!codigoMercancia.equals(other.codigoMercancia))
			return false;
		return true;
	}

}
