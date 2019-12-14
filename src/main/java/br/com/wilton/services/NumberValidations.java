package br.com.wilton.services;

import org.springframework.stereotype.Service;

@Service
public class NumberValidations {

	public boolean isNumeric(String numeric) {
		
		if(numeric == null ) return false;
		
		return numeric.replaceAll(",", ".").matches("[-+]?[0-9]*\\.?[0-9]+");
	}
	
}
