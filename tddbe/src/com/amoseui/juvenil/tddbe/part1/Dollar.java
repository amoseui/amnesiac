package com.amoseui.juvenil.tddbe.part1;

public class Dollar extends Money {
	
	Dollar(int amount) {	
		this.amount = amount;
	}
	
	Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}
}
