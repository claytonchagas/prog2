package excecoes;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TesteException2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			new FileReader("C:\\arquivoDeTeste.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}