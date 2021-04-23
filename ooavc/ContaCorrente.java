package ooavc;

public class ContaCorrente extends Conta{
	void correcao(double taxa) {
		this.saldo += this.saldo * 1.2;
	}
}