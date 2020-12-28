package exercicio5;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// Fazer um programa para ler o código de uma peça 1,
		// o número de peças 1, o valor unitário de cada peça 1,
		// o código de uma peça 2, o número de peças 2 e o valor 
		// unitário de cada peça 2. Calcule e mostre o valor a ser pago
		
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qte1, qte2;
	    double preco1, preco2, total;

	    cod1 = sc.nextInt();
	    qte1 = sc.nextInt();
	    preco1 = sc.nextDouble();
	    
	    cod2 = sc.nextInt();
	    qte2 = sc.nextInt();
	    preco2 = sc.nextDouble();

	    total = preco1 * qte1 + preco2 * qte2;

	    System.out.printf("Total para pagar: R$ %.2f%n", total);
	    
		sc.close();
	}

}
