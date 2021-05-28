package multiprocessing;

public class TestaContador {
	public static void main(String[] args) {
		Contador c1 = new Contador();
		c1.setCont(1);
		c1.contar();
		
		Contador c2 = new Contador();
		c2.setCont(2);
		c2.contar();
	}
}