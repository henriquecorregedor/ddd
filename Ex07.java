package entrada_processamento_saida;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
   	  	 
   	 double primeiro, segundo, terceiro, quarto, quinto, soma, valor;
   	 
   	 System.out.printf("Digite o valor do 1� produto: ");
   	 primeiro = ler.nextDouble();
   	 System.out.printf("Digite o valor do 2� produto: ");
   	 segundo = ler.nextDouble();
   	 System.out.printf("Digite o valor do 3� produto: ");
   	 terceiro = ler.nextDouble();
   	 System.out.printf("Digite o valor do 4� produto: ");
   	 quarto = ler.nextDouble();
   	 System.out.printf("Digite o valor do 5� produto: ");
   	 quinto = ler.nextDouble();
   	 
   	 System.out.printf("Informe o valor total que voc� ir� utilizar para realizar o pagamento: ");
   	 valor = ler.nextDouble();

   	 soma = valor - (primeiro + segundo + terceiro + quarto + quinto);
	 
   	 System.out.printf("Seu troco ser� de: %.2f", soma);

	}

}
