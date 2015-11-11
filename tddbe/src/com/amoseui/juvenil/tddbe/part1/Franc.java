package com.amoseui.juvenil.tddbe.part1;

public class Franc extends Money {
	
	Franc(int amount, String currency) {
		super(amount, currency);
	}

	Money times(int multiplier) {
		return Money.franc(amount * multiplier);
	}
}
