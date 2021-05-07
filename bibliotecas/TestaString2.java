package bibliotecas;

public class TestaString2 {
	public static void main(String[] args) {
		String a = "Java ADS na veia";
		String b[] = a.split(" ");
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		
		String c = "java ads na veia";
		int i = a.compareTo(a);
		System.out.println(i);
		int j = c.compareTo(a);
		System.out.println(j);
		int k = a.compareToIgnoreCase(c);
		System.out.println(k);
		
		a.toLowerCase();
		System.out.println(a);
		System.out.println(a.toLowerCase());
		String e = a.toLowerCase();
		System.out.println(e);
		
		c.toUpperCase();
		System.out.println(c);
		System.out.println(c.toUpperCase());
		String f = c.toUpperCase();
		System.out.println(f);
	}
}