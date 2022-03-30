package entrada_processamento_saida;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double dolar, conversao;
		
		System.out.printf("Digite a quantia em Dolar Americano: ");
		dolar = ler.nextDouble();
		
		conversao = dolar / 4.77;
		System.out.printf("O valor total da quantia convertida em Reais é: %.2f", conversao);
		
	}

}
