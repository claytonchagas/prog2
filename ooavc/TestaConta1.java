package ooavc;

public class TestaConta1 {
	public static void main(String[] args) {
		//Operacao de declaracao
		//So criou a referencia, o ponteiro
		//Conta c1;
		
		//Operacao de instanciacao
		//Agora eu criei concretamente a
		//Estrutura de uma Conta em memo
		//c1 = new Conta();
		
		//Fazendo declaracao e instanciacao
		//Na mesma linha
		Conta c1 = new ContaPoupanca();
//		c1.setNumero(001);
//		System.out.println(c1.getNumero());
		
		//Operacoes de inicializacao dos atributos
		c1.numero = 001;
		c1.nome = "Mateus";
		c1.saldo = 1000.0;
		c1.limite = 100.0;
		
		System.out.println("Nro conta:"+c1.numero);
		System.out.println("Titular:"+c1.nome);
		System.out.println("Saldo atual:"+c1.saldo);
		System.out.println("Limite:"+c1.limite);
		
		double valorSaque = 20000;
		boolean resultado = c1.sacar(valorSaque);
		//if(c1.sacar(valorSaque)) fasttrack (Luiza)
		if(resultado) {
			System.out.println("Voce sacou R$"+valorSaque+ " e seu saldo atual eh:"+c1.saldo);
		} else {
			System.out.println("Saque não autorizado, valor acima do possível");
		}
		
		
//		System.out.println("Saldo atual:"+c1.saldo);
		
		
		
	}
}