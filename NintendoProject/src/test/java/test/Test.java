package test;

import metier.Jeu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import metier.Achat;
import metier.Portable;
import metier.Salon;
import metier.Client;
import metier.Hybride;

public class Test {

	public static void main(String[] args) {

		Salon c1 = new Salon("PC");
		Hybride c2 = new Hybride("Switch");
		Portable c3 = new Portable("DS");
		Salon c4 = new Salon("PS1");
		Salon c5 = new Salon("Gamecube");

		Jeu j1 = new Jeu("WoW", c1, null);
		Jeu j2 = new Jeu("Fallout New Vegas", c2, null);
		Jeu j3 = new Jeu("MarioKart", c3, null);
		Jeu j4 = new Jeu("Final Fantasy 7", c4, null);
		Jeu j5 = new Jeu("Super Mario Sunshine", c5, null);
		
		Achat a1 = new Achat(j1,"2022-10-10",50);
		Achat a2 = new Achat(j2,"2022-10-15",60);
		
		List<Achat> achats = new ArrayList();
		Collections.addAll(achats, a1,a2);
		
		Client cl1 = new Client ("Moha","Kant",achats);
		Client cl2 = new Client ("Rose","Queen");
		
		
		
		
		
		
	}
}

