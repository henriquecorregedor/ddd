package estrutura_decisao;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double a , v0, t, vm, vk;
		
		System.out.printf("Informe sua acelar��o em m/s: ");
		a = ler.nextDouble();
		
		System.out.printf("Informe sua velocidade inicial em m/s: ");
		v0 = ler.nextDouble();
		
		System.out.printf("Informe o tempo do seu percuso em segundos: ");
		t = ler.nextDouble();
		
		vm = v0 + (a * t);
		vk = vm * 3.6;
		
		if (vk <= 40) {
			
				System.out.printf("%.1f km/h---Ve�culo muito lento", vk);
			}else if ((40 < vk) && (vk <= 60)){
				
				System.out.printf("%.1f km/h---Ve�culo na velocidade permitida", vk);
			}else if ((60 < vk) && (vk <= 80)) {
				
				System.out.printf("%.1f km/h---Ve�culo na velocidade de cruzeiro", vk);
			}else if ((80 < vk) && (vk <= 120)) {
				
				System.out.printf("%.1f km/h---Ve�culo r�pido", vk);
			}else if((vk > 120)) {
				
				System.out.printf("%.1f km/h---O ve�culo muito r�pido", vk);
		}
	}


	}
