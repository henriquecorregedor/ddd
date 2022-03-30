package estrutura_decisao;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double p1, p2;
		
		System.out.printf("Quanto vc tirou na P1: ");
		p1 = ler.nextDouble();
		
		p2 = (15 - p1) / 2;
		System.out.printf("Sua nota na P2 deverá ser: %.2f 5ou mais para ser APROVADO!", p2);
		
	}

}
