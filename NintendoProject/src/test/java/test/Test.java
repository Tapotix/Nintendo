package test;

import metier.Jeu;
import model.Matiere;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import metier.Achat;
import metier.Client;
import metier.Console;

public class Test {

	public static void main(String[] args) {

		Console c1 = new Console("PC");
		Console c2 = new Console("XBOX360");
		Console c3 = new Console("Wii");
		Console c4 = new Console("PS1");
		Console c5 = new Console("Gamecube");

		Jeu j1 = new Jeu("WoW", c1);
		Jeu j2 = new Jeu("Fallout New Vegas", c2);
		Jeu j3 = new Jeu("MarioKart", c3);
		Jeu j4 = new Jeu("Final Fantasy 7", c4);
		Jeu j5 = new Jeu("Super Mario Sunshine", c5);
		
		Achat a1 = new Achat(j1,"2022-10-10",50);
		Achat a2 = new Achat(j2,"2022-10-15",60);
		
		List<Achat> achats = new ArrayList();
		Collections.addAll(achats, a1,a2);
		
		Client cl1 = new Client ("Moha","Kant",achats);
		Client cl2 = new Client ("Rose","Queen",);
		
		
		
		
		
		
	}
}

