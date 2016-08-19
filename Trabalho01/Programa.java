import java.util.Scanner;

class Programa {
	public static void main(String args[]) {
		int opcao;
		float valor;
		Conta minhaConta = new Conta();
		Scanner entrada = new Scanner(System.in);

		minhaConta.cliente = "Priscila";
		minhaConta.numero = 1;
		minhaConta.saldo = 100;
		minhaConta.limite = 10;

		do {
			System.out.println("|---------------------------------------------------|");
			System.out.println("|  1 - Saldo | 2 - Saque | 3 - Depósito | 4 - Sair  |");
			System.out.println("|---------------------------------------------------|");
			opcao = entrada.nextInt();

			switch (opcao) {
				case 1:
					minhaConta.getSaldo();
					break;
				case 2:
					System.out.println("Digite o valor do saque: ");
					valor = entrada.nextFloat();
					if (valor > 0) {
						if (minhaConta.saque(valor)) {
							System.out.println("Saque realizado com sucesso!");
						} else {
							System.out.println("Saldo insuficiente.");
						}
					} else {
						System.out.println("Valor inválido!");
					}
					break;
				case 3:
					System.out.println("Digite o valor do depósito: ");
					valor = entrada.nextFloat();
					if (valor > 0) {
						minhaConta.deposito(valor);
						System.out.println("Depósito realizado com sucesso!");
					} else {
						System.out.println("Valor inválido!");
					}
					break;
				case 4:
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opção inválida!");
			}
		} while (opcao != 4);
	}
}