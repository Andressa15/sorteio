package com.br.zup;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String usuario = "";
		int filme = 1;
		int livro = 2;
		int musica =3;

		System.out.println(" Informe numero conforme o desejo"
				+ "(1) Adicionar Filme" + 
				"(2) Adicionar Livro;\n" + 
				"(3) Adicionar Música;\n" + 
				"");
		usuario = entrada.next();

		//if (usuario == 1) {

			//System.out.println("Informe as caracteristicas do filme, tipo: "
				//	+ "nome, categoria ,  genero, duracao");
			//usuario = entrada.next()

			
		//} else if ( usuario == 2) {
			//System.out.println("Informe as caracteristicas do livro, tipo:"
				//	+ "nome, categoria, autor, paginas");
			//usuario = entrada.next();

			
		//}else if (String usuario == 3) {
			//System.out.println("Informe as caracteristicas do musica, tipo:"
				//	+ "nome, categoria, cantor, banda, genero");
	//	usuario = entrada.next();
//	}

//}
