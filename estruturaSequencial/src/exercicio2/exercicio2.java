package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// Faça um programa para ler o valor do raio de um círculo,
		// e depois mostrar o valor da área deste círculo com quatro
		// casas decimais conforme exemplos.
		// Fórmula da área: area = π . raio2
		// Considere o valor deπ = 3.14159
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double pi, area, raio;
		raio = sc.nextDouble();
		pi = 3.14159;
		
		area = pi * raio * raio;
		
		System.out.printf("O valor da área deste círculo é: %.4f", area);
		
		sc.close();
	}

}
