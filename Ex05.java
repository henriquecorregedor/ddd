package entrada_processamento_saida;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

	Scanner ler = new Scanner(System.in);
   	 
   	 double c, farenheit;
   	 
   	 System.out.printf("Digite a temperatura em Celsius: ");
   	 c = ler.nextDouble();
   	    	 
   	 farenheit = (c * 1.8) + 32;
   	 System.out.printf("A temperatura em Fahrenheit é: %.2f", farenheit);

	}

}
