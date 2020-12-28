package exercicio1;

import java.util.Scanner;
public class exercicio1 {

	public static void main(String[] args) {
		// Faça um programa para ler dois valores inteiros,
		// e depois mostrar na tela a soma desses números
		// com uma mensagem explicativa.
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int calc = num1 + num2;
		
		System.out.println("O resultado dos dois números somados é: " +  calc);
		
		sc.close();
	}

}
