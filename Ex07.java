package entrada_processamento_saida;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
   	  	 
   	 double primeiro, segundo, terceiro, quarto, quinto, soma, valor;
   	 
   	 System.out.printf("Digite o valor do 1º produto: ");
   	 primeiro = ler.nextDouble();
   	 System.out.printf("Digite o valor do 2º produto: ");
   	 segundo = ler.nextDouble();
   	 System.out.printf("Digite o valor do 3º produto: ");
   	 terceiro = ler.nextDouble();
   	 System.out.printf("Digite o valor do 4º produto: ");
   	 quarto = ler.nextDouble();
   	 System.out.printf("Digite o valor do 5º produto: ");
   	 quinto = ler.nextDouble();
   	 
   	 System.out.printf("Informe o valor total que você irá utilizar para realizar o pagamento: ");
   	 valor = ler.nextDouble();

   	 soma = valor - (primeiro + segundo + terceiro + quarto + quinto);
	 
   	 System.out.printf("Seu troco será de: %.2f", soma);

	}

}
