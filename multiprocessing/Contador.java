package multiprocessing;

public class Contador {
	private int cont;
	
	public void setCont(int cont) {
		this.cont = cont;
	}

	public void contar() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Contador "+cont+", valor: "+i);
		}
	}	
}