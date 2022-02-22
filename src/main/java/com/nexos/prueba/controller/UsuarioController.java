package com.nexos.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nexos.prueba.models.Usuario;
import com.nexos.prueba.models.UsuarioPK;
import com.nexos.prueba.services.UsuarioService;
import com.nexos.prueba.util.MsgCodes;
import com.nexos.prueba.util.OutcomeCodes;
import com.nexos.prueba.util.RequestResolver;
import com.nexos.prueba.util.RequestResponse;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("v1/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService service;
	

	@RequestMapping(method = RequestMethod.POST, value = "/guardarUsuario")
	public RequestResponse<List<Usuario>> guardarUsuario(@RequestBody Usuario user){
		RequestResolver<List<Usuario>> resolver= new RequestResolver<>();
		OutcomeCodes codes = OutcomeCodes.of(MsgCodes.success,MsgCodes.genericError);
		return resolver.processRequest(codes, () -> service.guardarUsuario(user));
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/eliminarUsuario")
	public RequestResponse<List<Usuario>> eliminarUsuario(@RequestBody UsuarioPK UsuarioPK){
		RequestResolver<List<Usuario>> resolver= new RequestResolver<>();
		OutcomeCodes codes = OutcomeCodes.of(MsgCodes.success,MsgCodes.genericError);
		return resolver.processRequest(codes, () -> service.eliminarUsuario(UsuarioPK));
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/obtenerUsuarios")
	public RequestResponse<List<Usuario>> obtenerUsuarios(){
		RequestResolver<List<Usuario>> resolver= new RequestResolver<>();
		OutcomeCodes codes = OutcomeCodes.of(MsgCodes.success, MsgCodes.genericError);
		return resolver.processRequest(codes, ()->service.obtenerUsuarios());
	}
}
