package com.amoseui.juvenil.tddbe.part1;

public class Dollar {

	int amount;
	
	Dollar(int amount) {	
		this.amount = amount;
	}
	
	void times(int multiplier) {
		amount *= multiplier;
	}
}
