import java.time.LocalDateTime;
import java.util.Scanner;

public class Scanner_Java {
	
	public static void main(String[] args) {
		
		Scanner fio = new Scanner(System.in);
		
		System.out.println("Digite Seu Nome: ");
		String nome = fio.nextLine();
		
		System.out.println("Olá " + nome + " em que ano você nasceu? ");
		
		LocalDateTime localDate = LocalDateTime.now();
		int anoAtual = localDate.getYear();
		
		int dataNacimento = fio.nextInt();
		int idade = (anoAtual - dataNacimento);
		
		System.out.println("Você tem " + idade + " anos");
		
	}

}
