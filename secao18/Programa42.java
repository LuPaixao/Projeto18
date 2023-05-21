package br.com.geekuniversity.secao18;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

//Escrevendo em arquivos

/*
  ele sobescreve
 */
public class Programa42 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		try {
			//Deste forma, toda vez que o programa for executado
			//o arq será recriadp e toda informação, se pré-existente
			//será excluída, recomeçando um arq zerado.
			PrintStream escrever = new PrintStream("Saída txt");
			
			for(int i = 0; i < 5; i++) {
				System.out.println("Escreva algo: ");
				String msg = teclado.nextLine();
				escrever.println(msg);
			}			
			escrever.close();
		}catch(FileNotFoundException e){
			System.out.println("Não foi possível criar o arquivo");
		}		
//		System.out.println(msg);
		
		teclado.close();
	}

}
