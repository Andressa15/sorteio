package com.br.zup;

import java.util.Scanner;
import java.util.Random;
public class Sorteio {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean winner = true;
		int i = 0;
		int numeroSorteio = (int) Math.random();

		int numUsuario;
		do {
			System.out.println(" Digite um numero");
			numUsuario = scan.nextInt();
			winner= numeroSorteio == numUsuario;

		}
			while (i++ <10 && winner ==( winner));

			if ( winner == true ) {
				System.out.println(" winner!!!");
			}else 
				System.out.println(" lose:(");
           
	}
}

