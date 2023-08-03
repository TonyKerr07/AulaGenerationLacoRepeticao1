package JavaTech;

import java.util.Scanner;

public class LacoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Explicação While
		
		int numero, somapar = 0, contimpar = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número qualquer: ");
		numero = leia.nextInt();
		
		while(numero != 0) {
			if(numero %2 ==0) {
				somapar += numero;
			} else {
				contimpar ++;
			}
			System.out.println("\nEntre com o próximo número: ");
			numero = leia.nextInt();
		}
		System.out.println("\nSomatório dos números pares: " + somapar);
		System.out.println("\nQuantidade de números impares: " + contimpar);
		
	}

}
