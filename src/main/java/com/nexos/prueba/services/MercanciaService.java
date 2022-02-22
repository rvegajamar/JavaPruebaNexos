package com.nexos.prueba.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexos.prueba.models.Cargo;
import com.nexos.prueba.models.CargoPK;
import com.nexos.prueba.models.MercanciaEncabezado;
import com.nexos.prueba.models.MercanciaEncabezadoPK;
import com.nexos.prueba.repositories.MercanciaEncabezadoRepository;

@Service
public class MercanciaService {
	
	@Autowired
	private MercanciaEncabezadoRepository repository;

	public List<MercanciaEncabezado> guardarMercancia(MercanciaEncabezado mercanciaEnc) {
		if(mercanciaEnc.getIdMercancia()==null) {
			repository.insertMercancia(mercanciaEnc.getCodigoMercancia(), mercanciaEnc.getNombreProducto(),
					                   mercanciaEnc.getCantidad(), mercanciaEnc.getFechaIngreso(), 
					                   mercanciaEnc.getUsuarioCrea(), mercanciaEnc.getUsuarioModifica());
		}else {
			repository.save(mercanciaEnc);
		}
		return repository.getMercancia();
	}
	
	public List<MercanciaEncabezado> obtenerMercancias(){
		return repository.getMercancia();
	}
	
	public List<MercanciaEncabezado> eliminarMercancia(MercanciaEncabezadoPK mercanciaEncPK){
    	Optional<MercanciaEncabezado> optional = repository.findById(mercanciaEncPK);
    	if(optional.isEmpty()) {
    		
    	}
    	repository.delete(optional.get());
		return repository.getMercancia();
	}
	
	
	public List <MercanciaEncabezado> VerificarNombre(MercanciaEncabezado mercanciaEnc){
		repository.verificarNombre(mercanciaEnc.getNombreProducto());
		return repository.getMercancia();
	}
}
