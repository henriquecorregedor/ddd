package estrutura_decisao;

import java.util.Scanner;

public class Ex12 {
	
	public static void main(String[] args) {

		Scanner ler =  new Scanner(System.in);
		
		double base, altura, area;

		System.out.printf("informe a base do retangulo");
		base = ler.nextDouble();

		System.out.printf("informe a altura do retangulo");
		altura = ler.nextDouble();

		area = base * altura;
		System.out.printf("Area � %.2f \n", area);
		if (area>100) {
		System.out.printf("Terreno Grande");
		}
		else {
		System.out.printf("Terreno Pequeno");
		}


		}


		}
