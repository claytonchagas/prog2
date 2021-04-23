package ooavc;

public class TestaConta3 {
	public static void main(String[] args) {
		Conta c1; //declaracao
		c1 = new Conta(); //instanciacao
		c1.limite = 100; //inicializacao
		
		Conta c2;
		c2 = c1; // "=" operador de atribuicao
		c2.limite = 200; //sobre-escrevendo
		//a area de memoria
		
		System.out.println(c1.limite);
		System.out.println(c2.limite);
	}
}