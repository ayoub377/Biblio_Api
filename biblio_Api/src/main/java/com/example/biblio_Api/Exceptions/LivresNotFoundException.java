package com.example.biblio_Api.Exceptions;

public class LivresNotFoundException extends RuntimeException {

	
	  public LivresNotFoundException(Long id) {  
		  super("Impossible de trouver le livre specifie " + id);
		  }
}
