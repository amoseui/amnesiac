package com.amoseui.juvenil.ooad.ch1;
import java.util.Iterator;
import java.util.List;


public class FindGuitarTester {

	public static void main(String[] args) {
		// 릭의 기타 재고 목록 셋업(초기화)
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocaster", Type.ELECTRIC, 12, Wood.ALDER, Wood.ALDER);
		
		List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
		if (!matchingGuitars.isEmpty()) {
			System.out.println("Erin, you might like these guitars:");
			for (Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext(); ) {
				Guitar guitar = (Guitar)i.next();
				GuitarSpec spec = guitar.getSpec();
				System.out.println("	We have a " + 
						spec.getBuilder() + " " + spec.getModel() + " " + 
						spec.getType() + " guitar:\n	" + 
						spec.getBackWood() + " back and sides,\n	" + 
						spec.getTopWood() + " top.\nYou can have it for only $" +
						guitar.getPrice() + "!\n	----");
			}
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}
	
	private static void initializeInventory(Inventory inventory) {
		// 기타들을 재고 목록에 등
		GuitarSpec spec = new GuitarSpec(Builder.FENDER, "Stratocaster", Type.ELECTRIC, 12, Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("V95693", 1499.95, spec);
		inventory.addGuitar("V9512", 1549.95, spec);
	}
	
}
