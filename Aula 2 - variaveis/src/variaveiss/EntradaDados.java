package variaveiss;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in); 
		
		String nome; 
		System.out.println("Digite seu nome: ");
		nome = sc.next();
		
		System.out.println("Voce digitou": + nome);
		
		System.out.println("Digite sua idade:");
		int idade = sc.nextInt();
		System.out.println("Voce digitou" + idade);
		
		System.out.println("Digite sua altura:");
		double altura = sc.nextDouble();
		System.out.println("Voce digitou: " + altura);
		
		
		sc.close();
		
		
		
	}

}
