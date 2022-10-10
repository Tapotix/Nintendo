package test;

import metier.Jeu;
<<<<<<< HEAD
<<<<<<< HEAD
import metier.Adresse;
import metier.Boutique;
=======
=======
import model.Matiere;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import metier.Achat;
>>>>>>> main
import metier.Client;
>>>>>>> main
import metier.Console;

public class Test {

	public static void main(String[] args) {

		Salon c1 = new Salon("PC");
		Hybride c2 = new Hybride("Switch");
		Portable c3 = new Portable("DS");
		Salon c4 = new Salon("PS1");
		Salon c5 = new Salon("Gamecube");

		Jeu j1 = new Jeu("WoW", c1);
		Jeu j2 = new Jeu("Fallout New Vegas", c2);
		Jeu j3 = new Jeu("MarioKart", c3);
		Jeu j4 = new Jeu("Final Fantasy 7", c4);
		Jeu j5 = new Jeu("Super Mario Sunshine", c5);
<<<<<<< HEAD

		Adresse adresse1 = new Adresse ("7", "rue victor hugo", "paris");
		Boutique boutique1 = new Boutique("shop", adresse1); 

=======
		
<<<<<<< HEAD
		Client cl1 = new Client ("Moha","Kant");
		Client cl2 = new Client ("Rose","Queen");
>>>>>>> main


=======
		Achat a1 = new Achat(j1,"2022-10-10",50);
		Achat a2 = new Achat(j2,"2022-10-15",60);
		
		List<Achat> achats = new ArrayList();
		Collections.addAll(achats, a1,a2);
		
		Client cl1 = new Client ("Moha","Kant",achats);
		Client cl2 = new Client ("Rose","Queen");
		
		
		
		
		
		
>>>>>>> main
	}
}

