package JavaTech;

import java.util.Scanner;

public class ExercicioDoWhile6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercício 6
		
		int  i=0;
		float numero, media, soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		
		do {
			System.out.println("\nDigite o número: ");
			numero = leia.nextFloat();
			
			if(numero %3 == 0 && numero != 0) {
				soma += numero;
				i++;
				
			}
			
			
		} while (numero < 0 || numero > 0);
		
		media = soma/i;
		
		System.out.printf("\nA média dos números multiplos de 3 é: %.2f",media);
		
		
		

	}

}
