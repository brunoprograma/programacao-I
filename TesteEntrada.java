import java.util.Scanner;

class TesteEntrada {
	public static void main(String[] args) {
		int x;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor de x:");
		x = entrada.nextInt();
		System.out.println("O valor de x é" + x);
	}
}
