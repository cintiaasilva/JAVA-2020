package exercicio4;

import java.util.Scanner;
import java.util.Locale;

public class exercicio4 {

	public static void main(String[] args) {
		// Fazer um programa que leia o n�mero de um funcion�rio,
		// seu n�mero de horas trabalhadas, o valor que recebe 
		// por hora e calcula o sal�rio desse funcion�rio. 
		// A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas decimais.
		Scanner sc = new Scanner(System.in);
		
		
		int funcionario, horas;
		double valor, salario;
		
		funcionario = sc.nextInt();
		horas = sc.nextInt();
		Locale.setDefault(Locale.US);
		valor = sc.nextDouble();
		
		salario = horas * valor;
		
		System.out.printf("Funcion�rio: %s%nSal�rio: $ %.2f%n", funcionario, salario);
		
		sc.close();
	}

}
