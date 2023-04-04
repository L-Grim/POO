package poo;

public class Lampada {
	
	// Atributos (Dados)
	boolean ligado; // Estado Da Lampada
	double potencia; // Potencia Da Lampada
	String modelo; // Identificao Da Lampada
	String tipo; // LED - Filamento De Carbono - Fluorecente
	
	// Métodos (Operações)
	void ligar() {
		ligado = true;
	}
	
	void desligar() {
		ligado = false;
	}
	
	public static void main(String[] args) {
		
		Lampada l1= new Lampada();
		
	}
	
}
