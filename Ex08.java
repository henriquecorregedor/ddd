package estrutura_decisao;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);
		
		double a, b;
		
		System.out.printf("Digite um número: ");
			a = ler.nextDouble();
			
		System.out.printf("Digite outro número: ");
			b = ler.nextDouble();
			
			if (a>b) {
				System.out.printf("O número %.2f é maior que %.2f", a,b);
			
			} else {
				System.out.printf("O número %.2f é maior", b,a);
			}
						
	}

}