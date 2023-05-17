package animais;

public class Cachorro extends Animal {

	// Construtor
	public Cachorro(String nome) {
		this.setNome(nome);
	}

	// @Override dos metodos de Animal
	void comer() {
		System.out.print("O cachorro ");
		super.comer();
	}
	
	void dormir() {
		System.out.print("O cachorro ");
		super.comer();
	}
}
