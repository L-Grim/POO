package cachorro;

import animal.Animal;

public class Cachorro extends Animal {

	// Atributos
	private int idade;

	// Construtor
	public Cachorro(String nome) {
		this.setNome(nome);
	}

	// Metodos
	public void latir() {
		System.out.println(this.getNome() + " AU! AU! AU!");
	}

}
