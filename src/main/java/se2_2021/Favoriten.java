package se2_2021;

import java.util.ArrayList;

public class Favoriten {

	private ArrayList<String> favoriten = new ArrayList<String>();
	
	public void favoriteHinzufügen(String name, String adresse) {
		String n = name + " : " + adresse;
		favoriten.add(n);
	}
	
	
	public void favoriteEntfernen(String name, String adresse) {
		String n = name + " : " + adresse;
		for (String str : favoriten) {
			if (n.equals(str)) {
				favoriten.remove(str);
			}
		}
	}
	
	public ArrayList<String> getFavoriten() {
		return favoriten;
	}
	
	
	public void favoritenAnzeigen() {
		for (String str : favoriten) {
			System.out.println(str);
		}
	}
	
	
	
	
}
