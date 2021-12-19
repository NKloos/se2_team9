package se2_2021;

public class batterieWarnung {

	public static void main(String[] args) {
		batterieAlert(50);
	}

	public static void batterieAlert(int batterieLadung) {
		int bl = 20;
		boolean status;
		if (batterieLadung <= bl) {
			System.out.print("Batterie - Reichweite kritisch! Bitte die nächste Ladestation aufsuchen!");
			status = false;
		}

		else {
			System.out.println("Batterie - Reichweite unkritisch");
			status = true;
		}

	}
	
}
