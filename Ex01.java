package entrada_processamento_saida;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int b, a, area;
		
		System.out.printf("Digite a base do ret�ngulo: ");
		b = ler.nextInt();
		
		System.out.printf("Digite a altura do ret�ngulo: ");
		a = ler.nextInt();
		
		area = b * a;
		
		System.out.printf("A �rea do ret�ngulo �: %d", area);
	}

}
