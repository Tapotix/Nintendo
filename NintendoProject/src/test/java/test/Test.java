package test;

import metier.Jeu;
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




	}
}

