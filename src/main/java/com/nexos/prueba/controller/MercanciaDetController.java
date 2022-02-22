package com.nexos.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.nexos.prueba.models.MercanciaDetalle;
import com.nexos.prueba.services.MercanciaDetalleService;
import com.nexos.prueba.services.MercanciaService;
import com.nexos.prueba.util.MsgCodes;
import com.nexos.prueba.util.OutcomeCodes;
import com.nexos.prueba.util.RequestResolver;
import com.nexos.prueba.util.RequestResponse;



@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("v1/mercanciaDet")


public class MercanciaDetController {
	
	@Autowired
	private MercanciaDetalleService service;
	
	@RequestMapping(method = RequestMethod.POST, value = "/guardarMovimiento")
	public RequestResponse<List<MercanciaDetalle>> guardarMovimientos(@RequestBody MercanciaDetalle mercanDet){
		RequestResolver<List<MercanciaDetalle>> resolver= new RequestResolver<>();
		OutcomeCodes codes = OutcomeCodes.of(MsgCodes.success,MsgCodes.genericError);
		return resolver.processRequest(codes, () -> service.guardarMovimiento(mercanDet));
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/obtenerMovimientos")
	public RequestResponse<List<MercanciaDetalle>> obtenerMovimientos(){
		RequestResolver<List<MercanciaDetalle>> resolver= new RequestResolver<>();
		OutcomeCodes codes = OutcomeCodes.of(MsgCodes.success, MsgCodes.genericError);
		return resolver.processRequest(codes, ()->service.obtenerMovimientos());
	}

}



