package se2_2021;

import java.util.ArrayList;

public class zielAuswaehlen {

	private ArrayList<Ziel> ziele = new ArrayList<Ziel>();

	public void addZiel(String name, String straße, int hausnummer, int postleitzahl, String ort) {
		ziele.add(new Ziel(name, straße, hausnummer, postleitzahl, ort));
	}

	public void printZiele() {
		for (int i = 0; i < ziele.size(); i++)
			System.out.println(i + " " + ziele.get(i).getName() + ": " + ziele.get(i).getStraße() + " "
					+ ziele.get(i).getHausnummer() + ", " + ziele.get(i).getPostleitzahl() + " "
					+ ziele.get(i).getOrt());
	}

	public ArrayList<Ziel> getZiele() {
		return ziele;
	}

	public void printZiel(int index) {
		int i = index - 1;
		System.out.println(i + " " + ziele.get(i).getName() + ": " + ziele.get(i).getStraße() + " "
				+ ziele.get(i).getHausnummer() + ", " + ziele.get(i).getPostleitzahl() + " " + ziele.get(i).getOrt());
	}

	public Ziel getZiel(int index) {
		return ziele.get(index - 1);
	}

	private class Ziel {

		private String name;
		private String straße;
		private int hausnummer;
		private int postleitzahl;
		private String ort;

		private Ziel(String name, String straße, int hausnummer, int postleitzahl, String ort) {
			this.name = name;
			this.straße = straße;
			this.hausnummer = hausnummer;
			this.postleitzahl = postleitzahl;
			this.ort = ort;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStraße() {
			return straße;
		}

		public int getHausnummer() {
			return hausnummer;
		}

		public int getPostleitzahl() {
			return postleitzahl;
		}

		public String getOrt() {
			return ort;
		}

	}

}
