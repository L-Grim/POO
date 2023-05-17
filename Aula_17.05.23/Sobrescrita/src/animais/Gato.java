package animais;

public class Gato extends Animal {

	// Construtor
	public Gato(String nome) {
		this.setNome(nome);
	}

	// @Override dos metodos de Animal
	void comer() {
		System.out.print("O gato ");
		super.comer();
	}
	
	void dormir() {
	System.out.print("O gato ");
	super.comer();
	}

}
