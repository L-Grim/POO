import java.util.Scanner;

public class Triangulo_Retangulo {
	
	Scanner scan = new Scanner(System.in);
	
	private double base;
	private double altura;
	
	double addBase() {
		base = scan.nextDouble();
		return base;
	}

	double addAltura() {
		altura = scan.nextDouble();
		return altura;
	}
	
	double area() {
		double area = (base * altura) / 2;
		return area;	
	}
	
	double hipotenusa() {
		double hipotenusa = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		return hipotenusa;
	}
	
	public static void main(String[] args) {
		
		Triangulo_Retangulo t1 = new Triangulo_Retangulo();
		System.out.println("Adicine uma altura ao triangulo");
		t1.addAltura();
		System.out.println("Adicine uma base ao triangulo");
		t1.addBase();
		
		System.out.println("A área do triangulo é: " + t1.area());
		System.out.println("A hipotenusa do triangulo é: " + t1.hipotenusa());
	}
}
