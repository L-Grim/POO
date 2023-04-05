import java.util.Scanner;

public class Projetor {
	
	Scanner scan = new Scanner(System.in);
	
	String modelo;
	String marca;
	int potencia; 
	boolean ligado;
	
	String declararModelo() {
		modelo = scan.nextLine();
		return modelo;
	}

	String declararMarca() {
		marca = scan.nextLine();
		return marca;
	}
	
	int declararPotencia() {
		potencia = scan.nextInt();
		return potencia;
	}
	
	boolean ligar() {
		System.out.println("Projetor Ligado");
		ligado = true;
		return ligado;
	}
	
	boolean desligar() {
		System.out.println("Projetor Desligado");
		ligado = false;
		return ligado;
	}
	
	public static void main(String[] args) {
		
		Projetor p1 = new Projetor();
		System.out.println("modelo");
		p1.declararModelo();
		System.out.println("marca");
		p1.declararMarca();
		System.out.println("potencia");
		p1.declararPotencia();
		
		p1.ligar();
		
		p1.desligar();
	}
	
}
