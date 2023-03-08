package scan_No_Java;

import java.util.Scanner;

public class usandoScanner {
	
	public static void main(String[] args) {
		
		Scanner teclado = new scanner(System.in);
		System.out.println("Qual o seu nome?");
		String nome = teclado.nextLine();
		
		System.out.print(nome.toUpperCase().replace());
		
	}

}
