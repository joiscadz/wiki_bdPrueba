package com.wiki_bdPrueba.wiki_bdPrueba.Service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiki_bdPrueba.wiki_bdPrueba.Entity.Autos;
import com.wiki_bdPrueba.wiki_bdPrueba.Exceptions.ExceptionsWiki;
import com.wiki_bdPrueba.wiki_bdPrueba.Models.Response;
import com.wiki_bdPrueba.wiki_bdPrueba.Repository.AutosRepository;
import com.wiki_bdPrueba.wiki_bdPrueba.Util.Constantes;
import com.wiki_bdPrueba.wiki_bdPrueba.Util.WikiUtils;

import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class AutosService {

	@Autowired
	AutosRepository autosRepository;

	public Response<Object> guardarAutos(Autos instance) {

		Response<Object> response = new Response<Object>();
		try {

			Autos autos = new Autos();
			autos.setColor(instance.getColor());
			autos.setMarca(instance.getMarca());
			autos.setModelo(instance.getModelo());

			if (Objects.isNull(autos))
				throw new ExceptionsWiki(Constantes.MENSAJE_NULL_AUTO, Constantes.CODIGO_ERROR_PROCESO);
			Autos guardar = autosRepository.save(autos);
			response.setResultset(guardar);

		} catch (Exception e) {
			log.error(e.toString(), e);
			WikiUtils.catchResponse(response, e);
		}

		return response;

	}

}
