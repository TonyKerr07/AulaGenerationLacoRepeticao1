package JavaTech;

import java.util.Scanner;

public class ExercicioFor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercício 1
		
		int i, n1, n2;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro número do intervalo: ");
		n1 = leia.nextInt();
		
		System.out.println("\nDigite o segundo número do intervalo: ");
		n2 = leia.nextInt();
		
		if (n1 < n2) {
			for(i=n1;i<=n2;i++) {
				if (i %3 == 0 && i %5 == 0) {
					System.out.println("\n" + i + " é multiplo de 3 e 5");
			
				}
			}
			
		} else {
			System.out.println("\nIntervalo inválido!");
		}
		
	}

}
