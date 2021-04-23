package ooavc;

public class TestaControleBonus {
	public static void main(String[] args) {
		ControleBonus controle = new ControleBonus();
		
//		Funcionario f1 = new Funcionario();
//		f1.setSalario(1000);
//		controle.setTotalBonus(f1);
//		System.out.println("Bonus acumulado:"+controle.getTotalBonus());
		//50
		
		Gerente g1 = new Gerente();
		g1.setSalario(10000);
		controle.setTotalBonus(g1);
		System.out.println("Bonus acumulado:"+controle.getTotalBonus());
		//50 + (500+5000) = 5550
	}
}