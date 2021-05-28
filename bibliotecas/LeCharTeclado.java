package bibliotecas;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeCharTeclado {
	public static void main(String[] args) {
		System.out.println("Digite uma única tecla: ");
		InputStream is = System.in; //InputStream: classe que sabe capturar um byte
//nesse caso, recebendo-o da entrada padrao do system
		InputStreamReader isr = new InputStreamReader(is);
		//ISR sabe receber um byte e transforma-lo em char
		char c;
		try {
			c = (char) isr.read();
			System.out.println("Voce digitou a tecla: "+c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}