package JavaTech;

import java.util.Scanner;

public class ExercícioFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercício 2
		
		int numero, i, contapar=0, contaimpar=0;
		Scanner leia = new Scanner(System.in);
		
		for (i=1;i<=10;i++) {
			System.out.println("\nEntre com um numero inteiro: ");
			numero = leia.nextInt();
			
			if(numero %2==0) {
				contapar ++;
				
			} else {
				contaimpar ++;
				
			}
			
		}
		System.out.println("\nTotal de numeros pares: " + contapar);
		System.out.println("\nTotal de numeros impares: " + contaimpar);
		
	}

}
