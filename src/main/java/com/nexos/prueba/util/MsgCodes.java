package com.nexos.prueba.util;

	public enum MsgCodes {

		
		/**
		 * Success codes
		 */
		success(200, "success"), 
		genericError(400,"error"),
		registroDupliado(1000, "registro_duplicado"),
		failureGetTipeContract(4001,"failure-get-tipe-contract"),
		/* Mensajes de error y éxito del módulo de nomina */
		noContrato(5000, "no_contrato"),
		contratoDuplicado(5001, "contrato_duplicado"),
		conceptoDuplicado(5002, "concepto_duplicado"),
		noNovedad(5003, "no_novedad"),
		conceptoTerceros(5004, "concepto_terceros"),
		beneficiarioTerceros(5004, "beneficiario_terceros"),

		noVariables(5005, "no_variables"),
		variablesDuplicadas(5006, "variables_duplicadas"),


		commonsCentroCostoFailure(412, "commons-centro-costos-failure"),
		commonsPlanCtaFailure(406, "commons-plan-cta-failure"),
		commonsNitsQueryFailure(403,"commons-nits-query-failure"),
		commonsAreaTrabajoFailure(404, "commons-area-trabajo-failure"),
		commonsTipoSolicitudFailure(405,"commons-tipo-solicitud-failure"),
		commonsSysRepoFormsFailure(407, "commons-sys-repo-forms-failure"),
		commonsSysRepoFormsFuenteFailure(408, "commons-sys-repo-forms-fuente-failure"),
		commonsOppUsuFailure(408, "commons-opp-usu-failure"),
		commonsConsecutivo(409, "commons_error_consecutivo"),
		commonsBorrar(410, "commons_borrar"),
		
		/* Mensajes de error y éxito del módulo de exógenas */
		exogenaCodigoSuccess(200, "exogena-codigo-success"),
		exogenaValorInformadoSuccess(200, "exogena-valor-informado-success"),
		exogenaLiteralUpdated(200, "exogena-literal-updated"),
		exogenaLiteralsQueriedSuccess(200, "exogena-literals-queried"),
		exogenaLiteralsQueriedByYear (200, "exogena-literals-queried-by-year"),
		exogenaNoLiteralToSave(200, "exogena-no-literal"),
		exogenaNoCodigoToSave(201, "exogena-no-codigo"),
		exogenaErrorSavingLiteral (401, "exogena-error-saving-literal"),
		exogenaErrorUpdatingLiteral(402, "exogena-saving-literal"),
		exogenaCodigosQueryFailure(404,"codigos-query-failure"), 
		exogenaErrorQueryingYears(405,"exogena-years-query-failure"), 
		exogenaDianCtaFailure(407, "exogena-dian-cta-failure"),
		exogenaFailureSavingDianCuentas(408,"exogena-failure-saving-dian-cuentas"),
		exogenaFailureSavingDianCuenta(409,"exogena-failure-saving-dian-cuenta"),
		exogenaErrorAsociandoLiteral(410,"exogena-error-asociando-vlr-informado"),
		exogenaCopiarParametrosFailure(411, "exogena-copiar-parametros-failure"),
		exogenaTiposDeRegistroFailure (412, "exogena-tipo-registro-failure"),
		
		
		/***/
		wflowFlujoProcesoDefEncSuccess(200, "wflow-flujo-def-success"),
		wflowFlujoProcesoDefDetSuccess(200, "wflow-flujo-def-detalle"),
		
		
		/**
		 * Failure Codes
		 */
		wflowCarpetaCreationFailure(4001,"wflow-carpeta-creation-failure"),
		wflowCarpetaQueryFailure(4002,"wflow-carpeta-query-failure"),
		wflowInstanciaQueryFailure(4003, "wflow-instancia-query-failure"),
		wflowTipoInstanciaQueryFailure(4004, "wflow-tipo-instancia-query-failure"),
		wflowInstanciaSavingFailure(4005,"wflow-instancia-saving-failure"),
		wflowTipoInstanciaSavingFailure(4006,"wflow-tipo-instancia-saving-failure"),
		wflowCarpetaPadreNoExiste(4007,"wflow-carpeta-padre-no-existe"),
		wflowEmpresaNoEnviadaEnCarpeta(4008,"wflow-empresa-no-enviada-en-carpeta"),
		wflowDefEstadosQueryFailure(4009,"wflow-def-estado-query-failure"),
		wflowDefEstadosSavingFailure(4010,"wflow-def-estado-saving-failure"),
		wflowTipoActividadInvalida(4011,"wflow-tipo-actividad-incorrecta"), 
		wflowActividadObligatoriaInvalida(4012,"wflow-actividad-obligatoria-invalida"), 
		wflowActividadQueryFailure(4013,"wflow-actividad-query-failure"), 
		wflowActividadNoEncontrada(4014,"wflow-actividad-a-mover-no-encontrada"),
		wflowActividadObligatoriaRequerida(4015,"wflow-actividad-obligatoria-requerida"),
		wflowObtenerSolicitudes(4016,"wflow-obtener-solicitudes"),
		
		
		wflowSysEstadoQueryFailure (4101,"wflow-sys-estado-query-failure"),
		wflowSysEstadoSavingFailure(4102,"wflow-sys-estado-saving-failure"), 
		wflowSysEstadoSinModulo(4103,"wflow-sys-estado-sin-modulo"),
		wflowSysEstadoSinNombre(4104,"wflow-sys-estado-sin-nombre"),
		wflowSysEstadoSinDocumento(4105,"wflow-sys-estado-sin-documento"),
		wflowSysEstadoCodigoNulo(4106,"wflow-sys-estado-sin-codigo"),
		
		wflowInstObtenerInicialesFailure(4107,"wflow-instancia-iniciales-failure"),
		wflowIniciarProcesoFailure(4108, "wflow-iniciar-proceso-failure"),
		wflowNoSeEncontroProceso(4109,"wflow-no-se-encontro-proceso"),
		wflowNoSeDeterminaProceso(4110, "wflow-no-se-determina-proceso"), 
		
		wflowDefEstadoIndefinido(4111, "wflow-defestado-no-definido"), 
		wflowEstadoProcesoActivoIndefinido(4111, "wflow-estado-proceso-activo-no-definido"), 
		wflowEstadoInstanciaActivaIndefinido(4112, "wflow-estado-instancia-activa-no-definido"),
		wflowEstadoActividadCompletadaNoDefinido(4113, "wflow-estado-actividad-completada-no-definido"),
		wflowSigteActividadNoEncontrada(4114,"wflow-sigte-actividad-no-encontrada"), 
		wflowNoExisteProcesoConId(4115,"wflow-no-existe-inst-proceso-con-id"), 
		wflowInstanciaInicialNoDefinida(4116,"wflow-instancia-incial-no-definida"),
		wflowInstanciaInicialMultiple(4117,"wflow-instancia-inicial-multiple"), 
		wflowMultiplesInstanciasSiguientes(4118,"wflow-multiples-instancias-siguientes"),
		wflowProblemasAlGenerarRecorrido(4119,"wflow-problemas-generar-recorrido"),
		wflowEjecucionDeActividadNoPermitida(4120,"wflow-ejecucion-actividades-no-permitida"),
		wflowProblemasAlEjecutarActividad(4121,"wflow-problemas-ejecutar-actividad"),
		wflowActividadErpSinFormulario(4122,"wflow-actividad-erp-sin-formulario"),
		wflowFuenteActividadErpNoDefinida(4123,"wflow-fuente-actividad-erp-no-definida"),
		wflowFuenteActividadErpNoCoincide(4124,"wflow-fuente-actividad-erp-no-coincide"),
		wflowFormularioActividadErpNoDefinida(4125,"wflow-formulario-actividad-erp-no-definida"),
		wflowFormularioActividadErpNoCoincide(4126,"wflow-formulario-actividad-erp-no-coincide"), 
		wflowNoSeEncontroActividadAnterior(4127,"wflow-no-se-encontro-actividad-anterior"), 
		wflowProblemasAlConsultarActividadesCompletadas(4128,"wflow-problemas-consultar-actividades-completadas"), 
		wflowUltimaActividadEjecutadaNoDefinida(4129,"wflow-actividad-ejecutada-no-definida"),
		wflowTipoFirmaNoDefinidoActividad(4130,"wflow-tipo-firma-no-definida"),
		
		wflowActividadCheckSinValor(1430,"wflow-actividad-check-sin-valor"),
		wflowActividadErpSinDatos(1431,"wflow-actividad-sin-datos"),
		wflowActividadErpSinTipoDocumentoAsociado(1432,"wflow-actividad-erp-sin-tipo-documento-asociado"),
		wflowDefActividadNoEncontrada(1433,"wflow-def-actividad-no-encontrada"),
		wflowDatosActividadNoEncontrada(1434,"wflow-datos-actividad-no-encontrada"),
		wflowDefActividadDocErpNoEncontrada(1435,"wflow-def-actividad-doc-erp-no-encontrada"),
		wflowProblemasAlBUscarDocErp(1436,"wflow-problemas-al-buscar-doc-erp"), 
		wlowFirmaAreaRangoMalDefinida(1437,"wflow-firma-area-rango-maldefinida"), 
		noSeEncontraronActividadesPendientes(1438,"wflow-no-se-encontraron-acividades-pendientes"),
		wlowProcesosRegistrados(1439,"wflow-procesos-registrados"),
		wflowActividadDeletingFailure(1440,"wflow-problemas-eliminando-actividad"),
		wflowInstanciaDeletingFailure(1441,"wflow-problemas-eliminando-instancia"),
		wflowProcesoDeletingFailure(1442,"wflow-problemas-eliminando-proceso"),
		wflowUsuarioFirmaNoEncontrado(1443,"wflow-usuario-firma-no-encontrado"),
		wflowProcesoVerificacionDatoFailure(1444,"wflow-problemas-al-Verificacion-dato-proceso"),
		wflowProcesoClonarFailure(1445,"wflow-problemas-al-clonar-proceso"),
		wflowProcesoObtenerBorradorFailure(1446,"wflow-problemas-al-buscar-procesos-borrador"),
		wflowProcesoObtenerCopiaFailure(1447,"wflow-problemas-al-buscar-copia-proceso"),
		wflowProcesoPublicarProcesoFailure(1448,"wflow-problemas-al-publicar-proceso"),
		wflowProcesoObtenerProcesoPadreFailure(1449,"wflow-problemas-buscar-proceso-padre"),
		wflowProblemasAlCargarArchivos(1450,"wflow-problemas-al-cargar-archivo"),
		wflowNoSeEncontroAdjunto(1451,"wflow-no-se-encontro-adjunto"),
		wflowImagenNoCargada (1452,"wflow-imagen-no-cargada"),
		wflowExistenCamposVacios(1453,"wflow-existen-campos-vacios"),
		woflowProblemasAlObtenerRuta(1454,"wflow-problemas-al-abtener-ruta"),
		wflowProblemasIngresarDatosWflDatosAdjunto(1455,"wflow-problemas-Ingresar-Datos-WflDatos-Adjunto");
		private int code;
		
		private String languageKey;
		
		MsgCodes(int code){
			this.code = code;
		}
		
		MsgCodes(int code, String languageKey){
			this.code = code;
			this.languageKey = languageKey;
		}
		
		public Integer code() {
			return this.code;
		}

		public String getLanguageKey() {
			return languageKey;
		}

		public void setLanguageKey(String languageKey) {
			this.languageKey = languageKey;
		}

		public static MsgCodes findByCode(String strcode) {
			for (MsgCodes code : MsgCodes.values()) {
				if (code.code == Integer.valueOf(strcode)) {
					return code;
				}
			}
			return null;
		}
}
