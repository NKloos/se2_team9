package se2_2021;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class zieleAuswaehlenTest {

	static zielAuswaehlen test;

	@BeforeEach
	public void setup() {
		test = new zielAuswaehlen();
		test.addZiel("Hochschule", "Paul-Wittsack-Straße", 10, 68163, "Mannheim");
		test.addZiel("Home", "Main-Neckar-Bahnstraße", 76, 68535, "Edingen-Neckerhausen");
	}

	@Test
	public void addAndGetZiel() {
		assertEquals("Hochschule: Paul-Wittsack-Straße 10, 68163 Mannheim",
				test.getZiel(1).getName() + ": " + test.getZiel(1).getStraße() + " " + test.getZiel(1).getHausnummer()
						+ ", " + test.getZiel(1).getPostleitzahl() + " " + test.getZiel(1).getOrt());
		assertEquals("Home: Main-Neckar-Bahnstraße 76, 68535 Edingen-Neckerhausen",
				test.getZiel(2).getName() + ": " + test.getZiel(2).getStraße() + " " + test.getZiel(2).getHausnummer()
						+ ", " + test.getZiel(2).getPostleitzahl() + " " + test.getZiel(2).getOrt());
	}

	@Test
	public void getZiele() {
		assertEquals("Hochschule", test.getZiele().get(0).getName());
		assertEquals("Paul-Wittsack-Straße", test.getZiele().get(0).getStraße());
		assertEquals(10, test.getZiele().get(0).getHausnummer());
		assertEquals(68163, test.getZiele().get(0).getPostleitzahl());
		assertEquals("Mannheim", test.getZiele().get(0).getOrt());

		assertEquals("Home", test.getZiele().get(1).getName());
		assertEquals("Main-Neckar-Bahnstraße", test.getZiele().get(1).getStraße());
		assertEquals(76, test.getZiele().get(1).getHausnummer());
		assertEquals(68535, test.getZiele().get(1).getPostleitzahl());
		assertEquals("Edingen-Neckerhausen", test.getZiele().get(1).getOrt());
	}

}
