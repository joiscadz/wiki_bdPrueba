package com.wiki_bdPrueba.wiki_bdPrueba.Models;

import com.wiki_bdPrueba.wiki_bdPrueba.Util.Constantes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response<T> {
	private String statuscode;
	private String statusmessage;
	private T resultset;
	
	public Response() {
		this.setStatuscode(Constantes.CODIGO_NO_ERROR);
		this.setStatusmessage(Constantes.CADENA_VACIA);
		this.setResultset(null);
	}

	

	
	

}
