package com.nexos.prueba.util;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;

import com.nexos.prueba.exceptions.PruebaException;


public class RequestResolver<E> {

	
	public RequestResponse<E> processRequest(OutcomeCodes codes, ServiceFn<E> fn){
		try {
			E ret = fn.call();
			RequestResponse<E> response = new RequestResponse<>();
			response.setLoad(ret);
			response.setResponseCode(codes.successCode.code());
			response.setMessage(getResponseMessage(codes.successCode, codes.successMap));
			return response;
		}catch (PruebaException ex) {
			RequestResponse<E> response = new RequestResponse<>();
			response.setResponseCode(ex.code.code());
			response.setMessage(getResponseMessage(ex.code, ex.messageAttributes));
			return response;
		}catch (Exception ex) {
			ex.printStackTrace();
			RequestResponse<E> response = new RequestResponse<>();
			response.setResponseCode(codes.failureCode.code());
			//response.setMessage(getResponseMessage(codes.failureCode, Map.of("errorMessage",ex.getMessage())));
			return response;
		}
	}
	
	public RequestResponse<List<E>> processPageableGetRequest(OutcomeCodes codes, ServiceFn<Page<E>> fn){
		try {
			Page<E> ret = fn.call();
			RequestResponse<List<E>> response = new RequestResponse<>();
			response.setLoad(ret.getContent());
			response.setResponseCode(codes.successCode.code());
			response.setPageInfo(ret.getNumber(), ret.getNumberOfElements(), ret.getTotalElements());
			response.setMessage(getResponseMessage(codes.successCode, codes.successMap));
			return response;
		}catch (Exception ex) {
			RequestResponse<List<E>> response = new RequestResponse<>();
			response.setResponseCode(codes.failureCode.code());
			//response.setMessage(getResponseMessage(codes.failureCode, Map.of("errorMessage",ex.getMessage())));
			return response;
		}
	}
	
	public String getResponseMessage (MsgCodes code) {
		MessageTextResolver messageResolver = new MessageTextResolver();
		return messageResolver.getMessage(code);
	}
	
	public String getResponseMessage (MsgCodes code, Map<String, String> attributes) {
		MessageTextResolver messageResolver = new MessageTextResolver();
		return messageResolver.getMessage(code, attributes);
	}
}
	
