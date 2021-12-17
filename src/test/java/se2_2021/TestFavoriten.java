package se2_2021;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class testFavoriten {
	
	
	

	@Test
	void testHinzufüegen() {
		Favoriten f = new Favoriten();
		f.favoriteHinzufügen("Herman", "Walter");
		assertEquals(1,f.getFavoriten().size());
		assertEquals("Herman : Walter",f.getFavoriten().get(0));
		
	}
	
	

}