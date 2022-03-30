package estrutura_decisao;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
	   		   	 
	   	 Double a, b;
	   	 
	   	 System.out.printf("Digite um número: ");
	   	 a = ler.nextDouble();
	   	 
	   	 System.out.printf("Digite outro número: ");
	   	 b = ler.nextDouble();
	   	 
	   	 if (a>b) {
	   	    System.out.printf("O número %.2f é o maior", a);
	   	 } 
	   	 else if (a<b) {
	   	 
	   		 System.out.printf("O número %.2f é o maior", b);
	   	 }	 
	   	 else if (a==b) {
	   		System.out.printf("Os números são iguais", a, b);
	   	 }
	
	}
}

