package JavaTech;

import java.util.Scanner;

public class ExercicioWhile3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercício 3
		
		int idade, i = 0, menor = 0, maior = 0;
		
		Scanner leia = new Scanner(System.in);
		
		while(i >= 0) {
			System.out.println("\nEntre com o próximo número: ");
			idade = leia.nextInt();
			
			if(idade < 21 && idade >= 0) {
				menor ++;
			} else if (idade > 50) {
				maior ++;
			}
			
			
			i = idade;
		}
		
		System.out.println("\nTotal de pessoas menores de 21 anos: " + menor);
		System.out.println("\nTotal de pessoas menores de 50 anos: " + maior);
		
		
	}

}
