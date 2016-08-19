class Conta {
	int numero;
	String cliente;
	float saldo;
	float limite;

	float saldoTotal() {
		return saldo+limite;
	}

	boolean saque(float valor) {
		float saldo = this.saldoTotal();

		if (saldo >= valor) {
			this.saldo -= valor;
			return true;
		}

		return false;
	}

	void deposito(float valor) {
		this.saldo += valor;
	}

	void getSaldo() {
		System.out.println("-----------------------------");
		System.out.println("Conta: " + this.numero + " - " + this.cliente);
		System.out.println("Saldo da conta: " + this.saldo);
		System.out.println("Limite da conta: " + this.limite);
		System.out.println("Saldo total: " + this.saldoTotal());
		System.out.println("-----------------------------");
	}
}