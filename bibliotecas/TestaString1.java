package bibliotecas;

public class TestaString1 {
	public static void main(String[] args) {
		String a = new String("Java ADS na veia");
		String b = new String("Java ADS na veia");
		//String a = "Java ADS na veia";
		//String b = "Java ADS na veia";
		//int a = 2; //tipo primitivo, o comportamento eh diferente
		//int b = 2; //tipo primitivo, o comportamento eh diferente
		if(a == b) { //na verdade para objetos ele compara o hash
			System.out.println("a e b são iguais (testa o objeto)");
		} else {
			System.out.println("a e b são objetos diferentes");
		}
		//se quero comparar o conteudo de um obj String, tenho que usar equals
//		if(a.equals(b)) { //testa o conteúdo do obj String
//			System.out.println("a e b são iguais (testa o conteudo)");
//		} else {
//			System.out.println("a e b são objetos diferentes");
//		}
	}
}