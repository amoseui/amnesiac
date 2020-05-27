package com.amoseui.juvenil.tddbe.part1;

public class Franc extends Money {
	
	Franc(int amount, String currency) {
		super(amount, currency);
	}

	static Money franc(int amount) {
		return new Money(amount, "CHF");
	}
}
