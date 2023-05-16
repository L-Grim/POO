package main;

import cachorro.Cachorro;
import gato.Gato;

public class Main {

	public static void main(String[] args) {

		Gato g1 = new Gato("Kuro");
		g1.comer();
		g1.andar();
		g1.miar();
		g1.dormir();
		
		Cachorro c1 = new Cachorro("Buta");
		c1.latir();
		
	}

}
