package JavaTech;

import java.util.Scanner;

public class ExercicioDoWhile5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercício 5
		int numero, soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		
		do {
			System.out.println("\nDigite o número: ");
			numero = leia.nextInt();
			
			if(numero>0) {
				if(numero %2 != 0) {
					soma += numero;
				}
				
			}
			
			
		} while (numero < 0 || numero > 0);
		
		System.out.println("\nA soma dos números positivos é: " + soma);
		
		
		
	}

}
