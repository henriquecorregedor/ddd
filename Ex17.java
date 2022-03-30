package estrutura_decisao;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double peso, altura, sexo, imc; 
		
		System.out.printf("Informe o seu peso: ");
		peso = ler.nextDouble();
		System.out.printf("Informe sua altura: ");
		altura = ler.nextDouble();
		System.out.printf("Informe seu sexo: (1)Feminino ou (2)Masculino ");
		sexo = ler.nextDouble();
		
		imc = peso / (altura*altura);
		
		if (sexo == 0) {
			
			if ((20 <= imc) && (imc < 25)) {
				System.out.printf("Parabéns! Você está no seu peso ideal.");
				
			}else {
				System.out.printf("Poxa. Você NÃO está no peso ideal, mas vamos trabalhar para mudar isso.");
				
			}}
		else if (sexo == 1) {
			
				if ((19 <= imc) && (imc < 24)) {
					System.out.printf("Parabéns! Você está no seu peso ideal.");
					
				}else {
					System.out.printf("Poxa. Você NÃO está no peso ideal, mas vamos trabalhar para mudar isso.");
		}}
	}
}