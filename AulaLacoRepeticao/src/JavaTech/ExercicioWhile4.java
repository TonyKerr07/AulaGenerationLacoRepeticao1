package JavaTech;

import java.util.Scanner;

public class ExercicioWhile4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercicio 4
		
		int Idade, Sexo, Categoria, back = 0, front = 0, mobilemaior = 0, fullmenor = 0;
		String  continua="S";
		
		Scanner leia = new Scanner(System.in);
		
		
		while(continua.equalsIgnoreCase("S")){
			System.out.println("\nDigite a idade: ");
			Idade = leia.nextInt();

			System.out.println("\nDigite o código do sexo:");
			System.out.println("\nCódigo - Sexo:");
			System.out.println("\n1 - Masculino");
			System.out.println("\n2 - Feminino");
			System.out.println("\n3 - Outros");
			Sexo = leia.nextInt();
			
			
			System.out.println("\nDigite o código do categoria:");
			System.out.println("\nCódigo - Categoria:");
			System.out.println("\n1 - Backend");
			System.out.println("\n2 - FrontEnd");
			System.out.println("\n3 - Mobile");
			System.out.println("\n4 - FullStack");
			Categoria = leia.nextInt();
			
			if (Categoria == 1) {
				back ++;
			}
	
			if(Sexo == 2) {
				if (Categoria == 2) {
					front ++;
				} else if (Categoria == 4) {
					if (Idade < 30) {
						fullmenor ++;
					}
				}	
			} 
			
			if(Sexo == 1) {
				if (Categoria == 3) {
					if (Idade > 40) {
						mobilemaior ++;
					}
				}	
			}
			
			System.out.println("\nVocê deseja continuar a leitura dos dados de um novo colaboradore? (S/N)");
			continua = leia.next();
		
		}
		
		System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + back);
		System.out.println("\nTotal de mulheres desenvolvedoras Frontend: " + front);
		System.out.println("\nTotal de homens desenvolvedores Mobile maiores de 40 anos: " + mobilemaior);
		System.out.println("\nTotal de mulheres desenvolvedoras FullStack menores de 30 anos: " + fullmenor);
	
	}

}
