package se2_2021;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class testFavoriten {
	
	
	

	@Test
	void testHinzufüegen() {
		Favoriten f = new Favoriten();
		f.favoriteHinzufügen("Zuhause", "Offenbergerstr. 28");
		assertEquals(1,f.getFavoriten().size());
		assertEquals("Zuhause : Offenbergerstr. 28",f.getFavoriten().get(0));
		
	}
	
	@Test
	void testEntfernen() {
		Favoriten f = new Favoriten();
		f.favoriteHinzufügen("Mutter", "Weinberstr. 6");
		f.favoriteHinzufügen("Zuhause", "Offenbergerstr. 28");
		assertEquals(2,f.getFavoriten().size());
		f.favoriteEntfernen("Mutter", "Weinberstr. 6");
		assertEquals("Zuhause : Offenbergerstr. 28",f.getFavoriten().get(0));
		assertEquals(1,f.getFavoriten().size());
		
		
	}
	
	

}