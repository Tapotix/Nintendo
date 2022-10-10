package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import metier.Achat;
import metier.Adresse;
import metier.Boutique;
import metier.Client;
import metier.Hybride;
import metier.Jeu;
import metier.Portable;
import metier.Salon;


public class Test {

	public static void main(String[] args) {
		
		Adresse adresse1 = new Adresse ("7", "rue victor hugo", "paris");
		Boutique b1 = new Boutique("shop", adresse1); 

		Salon c1 = new Salon("PC", 0, null);
		Hybride c2 = new Hybride("Switch", 0, null);
		Portable c3 = new Portable("DS", 0, null);
		Salon c4 = new Salon("PS1", 0, null);
		Salon c5 = new Salon("Gamecube", 0, null);

		Jeu j1 = new Jeu("WoW", c1, b1);
		Jeu j2 = new Jeu("Fallout New Vegas", c2, b1);
		Jeu j3 = new Jeu("MarioKart", c3, b1);
		Jeu j4 = new Jeu("Final Fantasy 7", c4, b1);
		Jeu j5 = new Jeu("Super Mario Sunshine", c5, b1);

		Client cl1 = new Client ("Moha","Kant");
		Client cl2 = new Client ("Rose","Queen");

		Achat a1 = new Achat(j1,"2022-10-10",50);
		Achat a2 = new Achat(j2,"2022-10-15",60);
		
		List<Achat> achats = new ArrayList();
		Collections.addAll(achats, a1,a2);

	}
}

