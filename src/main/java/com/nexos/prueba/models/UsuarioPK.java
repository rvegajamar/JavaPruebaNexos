package com.nexos.prueba.models;

import java.io.Serializable;
import java.util.Objects;

public class UsuarioPK implements Serializable{
	
	private Integer idUsuario;
	
	public UsuarioPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsuarioPK(Integer idUsuario) {
		super();
		this.idUsuario = idUsuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idUsuario == null) ? 0 : idUsuario.hashCode());
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
		UsuarioPK other = (UsuarioPK) obj;
		if (idUsuario == null) {
			if (other.idUsuario != null)
				return false;
		} else if (!idUsuario.equals(other.idUsuario))
			return false;
		return true;
	}

}
