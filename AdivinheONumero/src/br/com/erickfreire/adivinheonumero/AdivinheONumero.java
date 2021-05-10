package br.com.erickfreire.adivinheonumero;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * Programa em Java que sorteia um n�mero a ser adivinhado pelo usu�rio
 * @author Erick Freire
 * @version 1 - Criado em 09-05-2021 as 22:43
 */

public class AdivinheONumero {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		SecureRandom numneroAleatorio = new SecureRandom();
		
		int numero = 1 + numneroAleatorio.nextInt(1000);
		int adivinha = 0;
		
		
		System.out.println("Um n�mero foi sorteado de 1 a 1000, tente adivinhar qual foi:");
		
		System.out.print("\nDigite um n�mero: \n");
		adivinha = entrada.nextInt();
		
		while(adivinha != numero) {
			if(adivinha < numero)
				System.out.printf("%nNumero menor do que o n�mero sorteado! %n");
			if(adivinha > numero)
				System.out.printf("%nNumero maior do que o n�mero sorteado! %n");
			
			System.out.print("\nDigite um novo n�mero: \n");
			adivinha = entrada.nextInt();
			
		}
		
		System.out.printf("%nAcertou o n�mero sorteado � o: %d%n", numero);

	}

}
