package ooavc;

public class ContaPoupanca extends Conta{
	void correcao(double taxa) {
		this.saldo += this.saldo * 1.3;
	}
}