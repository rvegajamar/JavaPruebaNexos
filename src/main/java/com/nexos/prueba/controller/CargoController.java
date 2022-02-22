package com.nexos.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nexos.prueba.models.Cargo;
import com.nexos.prueba.models.CargoPK;
import com.nexos.prueba.models.Usuario;
import com.nexos.prueba.services.CargoService;
import com.nexos.prueba.util.MsgCodes;
import com.nexos.prueba.util.OutcomeCodes;
import com.nexos.prueba.util.RequestResolver;
import com.nexos.prueba.util.RequestResponse;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("v1/cargo")
public class CargoController {
	
	@Autowired
	private CargoService service;

	@RequestMapping(method = RequestMethod.POST, value = "/guardarCargo")
	public RequestResponse<List<Cargo>> guardarCargo(@RequestBody Cargo cargo){
		RequestResolver<List<Cargo>> resolver= new RequestResolver<>();
		OutcomeCodes codes = OutcomeCodes.of(MsgCodes.success,MsgCodes.genericError);
		return resolver.processRequest(codes, () -> service.guardarCargo(cargo));
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/obtenerCargos")
	public RequestResponse<List<Cargo>> obtenerCargos(){
		RequestResolver<List<Cargo>> resolver= new RequestResolver<>();
		OutcomeCodes codes = OutcomeCodes.of(MsgCodes.success, MsgCodes.genericError);
		return resolver.processRequest(codes, ()->service.obtenerCargos());
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/eliminarCargo")
	public RequestResponse<List<Cargo>> guardarCargo(@RequestBody CargoPK cargo){
		RequestResolver<List<Cargo>> resolver= new RequestResolver<>();
		OutcomeCodes codes = OutcomeCodes.of(MsgCodes.success,MsgCodes.genericError);
		return resolver.processRequest(codes, () -> service.eliminarUsuario(cargo));
	}
}
