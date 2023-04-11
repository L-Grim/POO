package calculadora_minimalista;

import java.util.Scanner;

public class Calculadora {
	
	static Scanner scan = new Scanner(System.in);
	
	int num1;
	int num2;
	
	int somar() {
		 int soma = num1 + num2;
		 return soma;
	 }
	
	int subtracao() {
		int sub = num1 - num2;
		return sub;
	}
	
	public static void main(String[] args) {
		
		Calculadora cal1 = new Calculadora();
		
		System.out.println("Digite um numero");
		cal1.num1 = scan.nextInt();
		System.out.println("Digite outro numero");
		cal1.num2 = scan.nextInt();
		
		System.out.println("A soma dos numeros é " + cal1.somar());
		System.out.println("A subtração dos numeros é " + cal1.subtracao());
		
	}
	
}
