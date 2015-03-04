
public class FindGuitarTester {

	public static void main(String[] args) {
		// 릭의 기타 재고 목록 셋업(초기화)
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		Guitar whatErinLikes = new Guitar("", 0, "fender", "stratocaster", "electric", "Alder", "Alder");
		
		Guitar guitar = inventory.search(whatErinLikes);
		if (guitar != null) {
			System.out.println("Erin, you might like this " + 
					guitar.getBuilder() + " " + guitar.getModel() + " " + 
					guitar.getType() + " guitar:\n	" + 
					guitar.getBackWood() + " back and sides,\n	" + 
					guitar.getTopWood() + " top.\nYou can have it for only $" +
					guitar.getPrice() + "!");
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}
	
	private static void initializeInventory(Inventory inventory) {
		// 기타들을 재고 목록에 등
		inventory.addGuitar("V95693", 1499.95, "Fender", "stratocaster", "electric", "Alder", "Alder");
	}
	
}
