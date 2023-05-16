package gato;

import animal.Animal;

public class Gato extends Animal {

	// Atributo
	int idade;

	// Construtor
	public Gato(String nome) {
		this.setNome(nome);
	}

	public static void main(String[] args) {

		Gato g1 = new Gato("Kuro");
		g1.comer();
		
		Gato g2 = new Gato("Mashiro");
		g2.dormir();
		
		Gato g3 = new Gato("Aka");
		g3.andar();
		
		g1.miar();
		g2.miar();
		g3.miar();
		
	}
}