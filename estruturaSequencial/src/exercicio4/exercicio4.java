package exercicio4;

import java.util.Scanner;
import java.util.Locale;

public class exercicio4 {

	public static void main(String[] args) {
		// Fazer um programa que leia o número de um funcionário,
		// seu número de horas trabalhadas, o valor que recebe 
		// por hora e calcula o salário desse funcionário. 
		// A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
		Scanner sc = new Scanner(System.in);
		
		
		int funcionario, horas;
		double valor, salario;
		
		funcionario = sc.nextInt();
		horas = sc.nextInt();
		Locale.setDefault(Locale.US);
		valor = sc.nextDouble();
		
		salario = horas * valor;
		
		System.out.printf("Funcionário: %s%nSalário: $ %.2f%n", funcionario, salario);
		
		sc.close();
	}

}
