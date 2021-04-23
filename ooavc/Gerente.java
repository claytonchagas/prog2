package ooavc;

public class Gerente extends Funcionario implements AcessoBancoInterno{
	int senha;

	public boolean verifica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso autorizado");
			return true;
		} else {
			System.out.println("Acesso não autorizado");
			return false;
		}
	}

	//	//v3 do bonus: percent 15% fixo sobre o salario
	//	//somente do gerente
	//	double getBonus() {
	//		return this.salario * 0.15;
	//	}

	//v4 do bonus: percent de Funcionario comum
	//mais um valor fixo: por exemplo de $5000
	//para o Gerente, de $10000 para o Diretor, etc
//	double getBonus() {
//		//return this.salario * 0.05 + 5000;
//		return super.getBonus() + 5000; //versao Luiza
//	}
	
	double getBonus() {
		return this.salario * 0.05 + 5000;
	}

}