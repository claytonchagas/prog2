package ooavc;

public class TestaPolimorfismo2 {
	public static void main(String[] args) {
		Gerente g2 = new Gerente();
		g2.setSalario(10000);
		System.out.println("Salario do Gerente g2:"+g2.getSalario());
		System.out.println("Bonus do Gerente g2:"+g2.getBonus());
	}
}
