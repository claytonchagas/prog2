package colecoes;

import java.util.HashMap;
import java.util.Map;

import ooavc.Conta3;

//Map é uma interface em Java, que simula uma estrutura
//de chave-valor

public class TestaMap {
	public static void main(String[] args) {
		Conta3 c1 = new Conta3();
		c1.depositar(10);
		Conta3 c2 = new Conta3();
		c2.depositar(20);
		Conta3 c3 = new Conta3();
		c3.depositar(30);
		
		Map<String, Conta3> mapaContas = new HashMap<String, Conta3>();
		mapaContas.put("Lucas", c1);
		mapaContas.put("Mateus", c2);
		mapaContas.put("Lissa", c3);
		
		Conta3 contaRecuperada = mapaContas.get("Mateus");
		System.out.println("Saldo da conta de Mateus: "+contaRecuperada.getSaldo());
	}
}