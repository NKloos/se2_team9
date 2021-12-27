package se2_2021;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class test_batterieWarnung {

	
	@Test
	void test_batterie1(){
		batterieWarnung b = new batterieWarnung();
		b.batterieAlert(75);
		assertTrue(true,"Batterie - Reichweite unkritisch");
	}

	
}
