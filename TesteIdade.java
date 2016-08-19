import java.util.Scanner;

class TesteIdade {
	public static void main(String[] args) {
		int x;
		boolean amigoDoDono;
		String respostaDoDono;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a sua idade:");
		x = entrada.nextInt();
		System.out.println("Dono, vc é amigo dele?");
		respostaDoDono = entrada.next();		
		amigoDoDono = respostaDoDono.equals('s');		

		if (x < 18 && !amigoDoDono) {
			System.out.println("Você NÃO pode entrar na festa!");
		} else {
			System.out.println("Você pode entrar na festa!");
		}
	}
}
