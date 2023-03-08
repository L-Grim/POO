package somando_Variaveis;

public class SomandoVariaveis {
	
	public static void main(String[] args) {
			
			int x, y, z;
			
			x = 42; //       x = 42, y = 0, z = 0
			y = x++; //      x = 43, y = 42, z = 0
			z = ++y; //      x = 43, y = 43, z = 43
			z = ++z + z; //  x = 43, y = 43, z = 88
			
			System.out.printf("x = " + x + ", y = " + y + ", z = " + z);
	
	}

}
