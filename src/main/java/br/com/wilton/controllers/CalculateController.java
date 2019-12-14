package br.com.wilton.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.wilton.exceptions.UnsuportedMathOperationException;
import br.com.wilton.services.NumberValidations;
import br.com.wilton.services.SimpleMath;

@RestController
public class CalculateController {
	
	@Autowired
	private NumberValidations validation;
	@Autowired
	private SimpleMath mathService;
	
	@GetMapping(value="/sum/{numberOne}/{numberTwo}")
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		
		if(!validation.isNumeric(numberOne) || !validation.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Calculo só é possivel com numeros");
		}
		
		return mathService.sum(Double.parseDouble(numberOne), Double.parseDouble(numberTwo));
	}
	
	@GetMapping(value="/substraction/{numberOne}/{numberTwo}")
	public Double substraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		
		if(!validation.isNumeric(numberOne) || !validation.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Calculo só é possivel com numeros");
		}
		
		return mathService.substract(Double.parseDouble(numberOne), Double.parseDouble(numberTwo));
	}
	
	
	@GetMapping(value="/mutiplication/{numberOne}/{numberTwo}")
	public Double mutiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		
		if(!validation.isNumeric(numberOne) || !validation.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Calculo só é possivel com numeros");
		}
		
		return mathService.mutiplication(Double.parseDouble(numberOne), Double.parseDouble(numberTwo));
	}
	
	@GetMapping(value="/division/{numberOne}/{numberTwo}")
	public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		
		if(!validation.isNumeric(numberOne) || !validation.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Calculo só é possivel com numeros");
		}
		
		return mathService.division(Double.parseDouble(numberOne), Double.parseDouble(numberTwo));
	}
	
	@GetMapping(value="/mean/{numberOne}/{numberTwo}")
	public Double mean(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		
		if(!validation.isNumeric(numberOne) || !validation.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Calculo só é possivel com numeros");
		}
		
		return mathService.mean(Double.parseDouble(numberOne) , Double.parseDouble(numberTwo));
	}
	
	
	@GetMapping(value="/squaresRoot/{numberOne}")
	public Double squaresRoot(@PathVariable("numberOne") String numberOne) throws Exception {
		
		if(!validation.isNumeric(numberOne)) {
			throw new UnsuportedMathOperationException("Calculo só é possivel com numeros");
		}
		
		return mathService.squareRoot(Double.parseDouble(numberOne));
	}	
}
