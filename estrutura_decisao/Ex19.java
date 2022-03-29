package estrutura_decisao;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double p1, p2, media;
		
		System.out.printf("Informe sua nota da P1: ");
		p1 = ler.nextDouble();
		
		System.out.printf("Informe sua nota da P2: ");
		p2 = ler.nextDouble();
		
		media = (((2 * p2) + p1)/3);
		
		if (media > 5) {
			System.out.printf("Parabéns! Você foi APROVADO e sua média é %.2f", media);
			
		}else if (media > 5) {
			System.out.printf("Que pena! Você foi REPROVADO e sua média é %.2f", media);
			
			
		}
		

	}

}
