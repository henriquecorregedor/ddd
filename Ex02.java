package entrada_processamento_saida;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, area;
		
		System.out.printf("Digite a aresta do quadrado: ");
		a = ler.nextInt();
		
		area = a * a;
		
		System.out.printf("A área do quadrado é: %d", area);
	}

}
