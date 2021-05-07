package bibliotecas;

public class TestaString3 {
	public static void main(String[] args) {
		String a = "Java ADS na veia";
		System.out.println(a);
		char c = a.charAt(3); //zero based
		System.out.println(c);
		int i = a.length(); //non zero based
		System.out.println(i);
		
		//Exercicios de exemplos que voces devem 
		//implementar com a classe String, os metodos:
		//TestaString4: subtring, trim, indexOf, lastIndexOf
		//TestaString5: isEmpty, contains, replace
	}
}