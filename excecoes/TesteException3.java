package excecoes;

import java.io.IOException;
import java.io.InputStreamReader;

public class TesteException3 {
	private static InputStreamReader conn;

	public static void main(String[] args) throws IOException, IllegalAccessException {
		try {
			//código com várias classes checked
		} finally {
			conn.close();
		}
	}
}