import java.util.Iterator;
import java.util.List;


public class FindGuitarTester {

	public static void main(String[] args) {
		// 릭의 기타 재고 목록 셋업(초기화)
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		
		List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
		if (!matchingGuitars.isEmpty()) {
			System.out.println("Erin, you might like these guitars:");
			for (Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext(); ) {
				Guitar guitar = (Guitar)i.next();
				System.out.println("	We have a " + 
						guitar.getBuilder() + " " + guitar.getModel() + " " + 
						guitar.getType() + " guitar:\n	" + 
						guitar.getBackWood() + " back and sides,\n	" + 
						guitar.getTopWood() + " top.\nYou can have it for only $" +
						guitar.getPrice() + "!\n	----");
			}
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}
	
	private static void initializeInventory(Inventory inventory) {
		// 기타들을 재고 목록에 등
		inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("V9512", 1549.95, Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
	}
	
}
