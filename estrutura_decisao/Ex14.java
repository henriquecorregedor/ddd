package estrutura_decisao;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double peso, altura, imc;

		System.out.printf("informe seu peso");
		peso = ler.nextDouble();

		System.out.printf("informe sua altura");
		altura = ler.nextDouble();

		imc= peso / (altura*altura);

		if (imc>=20) {
		if (imc<25) {
		System.out.printf("Peso Ideal");
		}



		}}}
