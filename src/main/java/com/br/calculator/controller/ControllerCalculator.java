package com.br.calculator.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCalculator {
	
	
	@RequestMapping(value="/sum/{number1}/{number2}", method = RequestMethod.GET)
	public Double sum (@PathVariable("number1") String number1, 
			@PathVariable ("number2") String number2)  throws Exception {
		if (!isNumeric (number1) || !isNumeric (number2)) {
			throw new Exception();
		}
		Double sum = convertToDouble(number1) + convertToDouble (number2);
		return sum;

	}
	
	
	private Double convertToDouble(String strNumber) {
		if (strNumber == null) return 0D;
		String number = strNumber.replaceAll(".", ",");
		if (isNumeric(number))	return Double.parseDouble(number);
		return 0D;
	}
		

	private boolean isNumeric(String number) {
		// TODO Auto-generated method stub
		return false;
	}

}
