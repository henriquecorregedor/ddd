package estrutura_decisao;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
	   		   	 
	   	 Double a, b;
	   	 
	   	 System.out.printf("Digite um n�mero: ");
	   	 a = ler.nextDouble();
	   	 
	   	 System.out.printf("Digite outro n�mero: ");
	   	 b = ler.nextDouble();
	   	 
	   	 if (a>b) {
	   	    System.out.printf("O n�mero %.2f � o maior", a);
	   	 } 
	   	 else if (a<b) {
	   	 
	   		 System.out.printf("O n�mero %.2f � o maior", b);
	   	 }	 
	   	 else if (a==b) {
	   		System.out.printf("Os n�meros s�o iguais", a, b);
	   	 }
	
	}
}

