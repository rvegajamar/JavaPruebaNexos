package com.nexos.prueba.exceptions;

import java.util.Map;

import com.nexos.prueba.util.MsgCodes;
public class PruebaException extends RuntimeException{

		
		/**
		 * 
		 */
		private static final long serialVersionUID = 2826872470146439442L;

		public MsgCodes code;
		
		public Map<String, String> messageAttributes;

		public PruebaException(MsgCodes code) {
			this(code, null);
		}
		
		public PruebaException(MsgCodes code, Map<String, String> messageAttributes) {
			super();
			this.code = code;
			this.messageAttributes = messageAttributes;
		}

	

}
