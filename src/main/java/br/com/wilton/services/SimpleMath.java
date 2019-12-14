package br.com.wilton.services;

import org.springframework.stereotype.Service;

@Service
public class SimpleMath {

	public Double sum(Double firstNumber, Double lastNumber) {
		return firstNumber + lastNumber;
	}
	
	public Double substract(Double firstNumber, Double lastNumber) {
		return firstNumber - lastNumber;
	}
	
	public Double mutiplication(Double firstNumber, Double lastNumber) {
		return firstNumber * lastNumber;
	}
	
	public Double division(Double firstNumber, Double lastNumber) {
		return firstNumber / lastNumber;
	}
	
	public Double mean(Double firstNumber, Double lastNumber) {
		return (firstNumber + lastNumber) / 2;
	}
	
	public Double squareRoot(Double firstNumber) {
		return Math.sqrt(firstNumber);
	}
}
