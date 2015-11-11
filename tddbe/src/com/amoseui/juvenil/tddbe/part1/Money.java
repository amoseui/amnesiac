package com.amoseui.juvenil.tddbe.part1;

public class Money {

	protected int amount;

	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount;
	}
}
