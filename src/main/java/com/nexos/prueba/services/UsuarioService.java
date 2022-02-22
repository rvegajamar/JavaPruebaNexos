package com.nexos.prueba.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexos.prueba.models.Usuario;
import com.nexos.prueba.models.UsuarioPK;
import com.nexos.prueba.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	public List<Usuario> guardarUsuario(Usuario user){
				if(user.getIdUsuario() == null) {
			repository.insertUsuarios(user.getNombreUsuario(), user.getEdad(), user.getCodigoCargo(), user.getFechaIngresoUsuario(), user.getNombreCargo());

		}else {
			repository.save(user);
		}
	
		
		return repository.getUsuarios();
	}
	
	public List<Usuario> obtenerUsuarios(){
		
		return repository.getUsuarios();
	}
	
    public List<Usuario> eliminarUsuario(UsuarioPK usuarioPK){
    	Optional<Usuario> optional = repository.findById(usuarioPK);
    	if(optional.isEmpty()) {
    		
    	}
    	repository.delete(optional.get());
		return repository.getUsuarios();
	}
}
