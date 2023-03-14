import java.time.LocalDateTime;
import java.util.Scanner;

public class Scanner_Java {
	
	public static void main(String[] args) {
		
		Scanner fio = new Scanner(System.in);
		
		System.out.println("Digite Seu Nome: ");
		String nome = fio.nextLine();
		
		System.out.println("Ol� " + nome + " em que ano voc� nasceu? ");
		
		LocalDateTime localDate = LocalDateTime.now();
		int anoAtual = localDate.getYear();
		
		int dataNacimento = fio.nextInt();
		int idade = (anoAtual - dataNacimento);
		
		System.out.println("Voc� tem " + idade + " anos");
		
	}

}
