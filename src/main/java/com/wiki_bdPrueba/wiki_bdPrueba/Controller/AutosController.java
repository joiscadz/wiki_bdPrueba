package com.wiki_bdPrueba.wiki_bdPrueba.Controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wiki_bdPrueba.wiki_bdPrueba.Entity.Autos;
import com.wiki_bdPrueba.wiki_bdPrueba.Models.Response;
import com.wiki_bdPrueba.wiki_bdPrueba.Service.AutosService;

import io.swagger.annotations.ApiOperation;
@RestController
@RequestMapping(value = "/autos")
public class AutosController {

	@Autowired
	AutosService autosservice;

	@PostMapping(value = "/agregar")
	@ApiOperation(value = "registro de nuevo auto", notes = "registro de nuevo auto")
	public Response<Object> agregar(@Valid @RequestBody Autos instance) {
		return autosservice.guardarAutos(instance);

	}

}
