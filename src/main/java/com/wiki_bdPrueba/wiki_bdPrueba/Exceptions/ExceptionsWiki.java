package com.wiki_bdPrueba.wiki_bdPrueba.Exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExceptionsWiki extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	private final String statusCode;

	public ExceptionsWiki(String message, String statusCode) {
		super(message);
		this.statusCode = statusCode;
	}

}
