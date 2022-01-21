package repaso;

import java.util.Scanner;

public class dni {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("introduce tu dni");
		int dni= entrada.nextInt();
		int resto=dni%23;
		char letras_dni[]={'T','R','W','A','G','M','Y','F','P','D','X','B','N',
									'J','Z','S','Q','V','H','L','C','K','E','N'};
		
		String nif =String.valueOf(dni)+letras_dni[resto];
		System.out.printf("la letra que corresponde a tu dni es: %3s",nif);

	}
	
}
