package estrutura_decisao;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);
		
		double a, b;
		
		System.out.printf("Digite um n�mero: ");
			a = ler.nextDouble();
			
		System.out.printf("Digite outro n�mero: ");
			b = ler.nextDouble();
			
			if (a>b) {
				System.out.printf("O n�mero %.2f � maior que %.2f", a,b);
			
			} else {
				System.out.printf("O n�mero %.2f � maior", b,a);
			}
						
	}

}