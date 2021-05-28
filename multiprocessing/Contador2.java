package multiprocessing;

public class Contador2 implements Runnable{
	private int cont;
	
	public void setCont(int cont) {
		this.cont = cont;
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Contador "+cont+", valor: "+i);
		}
	}	
}