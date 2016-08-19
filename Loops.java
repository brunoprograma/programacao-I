import java.util.Scanner;

class Loops {
	public static void main(String[] args) {
		int i, prim, seg, aux, fat, n, x, soma = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("1) Imprima todos os números de 120 a 280.");
		for (i = 120; i <= 280; i++) {
			System.out.print(i + " ");		
		}
		System.out.println();
		System.out.println();

		System.out.println("2) Imprima a soma de 1 até 500.");
		for (i = 1; i <= 500; i++) {
			soma += i;	
		}
		System.out.println("A soma é: " + soma);
		System.out.println();

		System.out.println("3) Imprima todos os múltiplos de 3, entre 50 e 150.");
		for (i = 50; i <= 150; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}		
		}
		System.out.println();
		System.out.println();

		System.out.println("4) Imprima os fatoriais de 1 a 10.");
		for (i = 1; i <= 10; i++) {
			for(fat = 1, n = i; n > 1; n -= 1) {
				fat *= n;
			}
			System.out.println("Fatorial de " + i + " é " + fat);		
		}
		System.out.println();

		System.out.println("5) No código do exercício anterior, aumente a quantidade de números que terão os fatoriais impressos, até 20, 30, 40. Em um determinado momento, além desse cálculo demorar, vai começar a mostrar respostas completamente erradas. Por quê?");
		for (i = 1; i <= 40; i++) {
			for(fat = 1, n = i; n > 1; n -= 1) {
				fat *= n;
			}
			System.out.println("Fatorial de " + i + " é " + fat);		
		}
		System.out.println("R: Porque o número é muito grande para ser do tipo int.");
		System.out.println();

		System.out.println("6) Imprima os primeiros números da série de Fibonacci até passar de 100. A série de Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc... Para calculá-la, o primeiro elemento vale 0, o segundo vale 1, daí por diante, o n-ésimo elemento vale o (n-1)-ésimo elemento somado ao (n-2)-ésimo elemento (ex: 8 = 5 + 3).");

		prim = 0;
		seg = 1;
		System.out.print(prim + ", " + seg + ", ");	

		do {
			aux = prim + seg;
			prim = seg;
			seg = aux;

			System.out.print(aux + ", ");
		} while(aux < 100);

		System.out.println();
		System.out.println();

		System.out.println("7) Escreva um programa que, dada uma variável x com algum valor inteiro, temos um novo x de acordo com a seguinte regra: se x é par, x = x / 2; se x é impar, x = 3 * x + 1; imprime x. O programa deve parar quando x tiver o valor final de 1.");
		
		System.out.println("Informe o valor de x:");
		x = entrada.nextInt();

		while (x != 1) {
			if (x % 2 == 0) {
				x /= 2; 
			} else {
				x = 3 * x + 1;
			}

			System.out.print(x + " -> ");
		}
		System.out.println();		
	}
}
