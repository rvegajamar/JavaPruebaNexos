package com.nexos.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nexos.prueba.models.MercanciaEncabezado;
import com.nexos.prueba.models.MercanciaEncabezadoPK;
import com.nexos.prueba.models.Usuario;
import com.nexos.prueba.models.UsuarioPK;
import com.nexos.prueba.services.MercanciaService;
import com.nexos.prueba.util.MsgCodes;
import com.nexos.prueba.util.OutcomeCodes;
import com.nexos.prueba.util.RequestResolver;
import com.nexos.prueba.util.RequestResponse;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("v1/mercanciaEnc")
public class MercanciaController {
	
	@Autowired
	private MercanciaService service;
	
	@RequestMapping(method = RequestMethod.POST, value = "/guardarMercancia")
	public RequestResponse<List<MercanciaEncabezado>> guardarMercancia(@RequestBody MercanciaEncabezado mercanEnc){
		RequestResolver<List<MercanciaEncabezado>> resolver= new RequestResolver<>();
		OutcomeCodes codes = OutcomeCodes.of(MsgCodes.success,MsgCodes.genericError);
		return resolver.processRequest(codes, () -> service.guardarMercancia(mercanEnc));
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/obtenerMercancias")
	public RequestResponse<List<MercanciaEncabezado>> obtenerMercancias(){
		RequestResolver<List<MercanciaEncabezado>> resolver= new RequestResolver<>();
		OutcomeCodes codes = OutcomeCodes.of(MsgCodes.success, MsgCodes.genericError);
		return resolver.processRequest(codes, ()->service.obtenerMercancias());
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/VerificarNombre")
	public RequestResponse<List<MercanciaEncabezado>> VerificarNombre(@RequestBody MercanciaEncabezado mercanEnc){
		RequestResolver<List<MercanciaEncabezado>> resolver= new RequestResolver<>();
		OutcomeCodes codes = OutcomeCodes.of(MsgCodes.success, MsgCodes.genericError);
		return resolver.processRequest(codes, ()->service.VerificarNombre(mercanEnc));
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/eliminarMercancia")
	public RequestResponse<List<MercanciaEncabezado>> eliminarMercancia(@RequestBody MercanciaEncabezadoPK mercanciaEncPK){
		RequestResolver<List<MercanciaEncabezado>> resolver= new RequestResolver<>();
		OutcomeCodes codes = OutcomeCodes.of(MsgCodes.success,MsgCodes.genericError);
		return resolver.processRequest(codes, () -> service.eliminarMercancia(mercanciaEncPK));
	}

}
