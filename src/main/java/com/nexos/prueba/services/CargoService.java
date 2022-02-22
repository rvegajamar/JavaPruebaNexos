package com.nexos.prueba.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexos.prueba.models.Cargo;
import com.nexos.prueba.models.CargoPK;
import com.nexos.prueba.models.Usuario;
import com.nexos.prueba.models.UsuarioPK;
import com.nexos.prueba.repositories.CargoRepository;

@Service
public class CargoService {
	
	@Autowired
	private CargoRepository repository;

	public List<Cargo> guardarCargo(Cargo cargo) {
		if(cargo.getCodigoCargo()==null) {
			repository.insertCargos(cargo.getNombreCargo());
		}else {
			repository.save(cargo);
		}
		return repository.getCargos();
	}
	
	public List<Cargo> obtenerCargos(){
		return repository.getCargos();
	}
	
	 public List<Cargo> eliminarUsuario(CargoPK cargo){
	    	Optional<Cargo> optional = repository.findById(cargo);
	    	if(optional.isEmpty()) {
	    		
	    	}
	    	repository.delete(optional.get());
			return repository.getCargos();
		}
}
