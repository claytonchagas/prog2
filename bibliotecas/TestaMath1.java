package bibliotecas;

public class TestaMath1 {
	public static void main(String[] args) {
		int i = -10;
		System.out.println(i);
		int j = Math.abs(i);
		System.out.println(j);
		System.out.println(Math.abs(i));
		
		double d1 = 4.49999999999;
		System.out.println(d1);
		double d2 = 4.000;
		System.out.println(d2);
		double d3 = Math.round(d1);
		System.out.println(d3);
		
		double d4 = Math.max(d1, d3);
		System.out.println(d4);
		
		//tarefas para a turma:
		//implementar e testar Math.min()
		
		//funções ceil e floor
		System.out.println(Math.ceil(d1));
		double d5 = 4.9999999999999;
		System.out.println(Math.floor(d5));
		
		System.out.println(Math.exp(1));
		
		System.out.println(Math.log(4));
		
		double d6 = Math.log(16) / Math.log(2);
		
		System.out.println(d6);
		
		//Math.sin retorna o seno do angulo
		System.out.println(Math.sin(180));
		
		//Math.toDegrees Converte radiano em graus.
		System.out.println(Math.toDegrees(3.141592653589793));
		
		//Math.toRadians Converte graus em radianos
		System.out.println(Math.toRadians(180));
		
		
		//implementar >>TestaMath2 e testar Math.exp, 
		//Math.log, Math.pow, Math.sqrt, log de a na base b
		//implementar >>TestaMath3 e ver a diferença de Math.sin
		//e Math.toDegrees, Math.toRadians
		
		float num1 = 3.3f;
		float num2 = 3.4f;
		System.out.println("Math.min(): "+Math.min(num1,num2));
		
	}
}