package JavaTech;

import java.util.Scanner;

public class LacoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Explicação aula For
		
		float n1, n2, n3, media, mg, somamedia=0;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=4;x++) {
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat();

			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			
			media = (n1+n2+n3)/3;
			System.out.printf("\nMédia alune %d foi de %.2f", x, media);
			somamedia += media;
				
		}
		
		mg = somamedia/4;
		System.out.printf("\nMédia geral da turma foi de: %.2f", mg);
		
	}

}
