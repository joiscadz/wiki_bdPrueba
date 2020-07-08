package com.wiki_bdPrueba.wiki_bdPrueba.Util;

import com.wiki_bdPrueba.wiki_bdPrueba.Exceptions.ExceptionsWiki;
import com.wiki_bdPrueba.wiki_bdPrueba.Models.Response;

public class WikiUtils {
	public static void catchResponse(Response<?> response, Exception e) {
		response.setResultset(null);
		 if (e instanceof ExceptionsWiki) {
			response.setStatuscode(((ExceptionsWiki) e).getStatusCode());
			response.setStatusmessage(((ExceptionsWiki) e).getMessage());
		} else { // Errores internos
			response.setStatuscode(Constantes.CODIGO_ERROR_PROCESO);
			response.setStatusmessage(Constantes.MENSAJE_ERROR_PROCESO);
		}
	}


}
