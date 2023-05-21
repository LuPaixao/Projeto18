package br.com.geekuniversity.secao18;
//Trabalhando com Strings

/*
 Em Java, Strings são imutáveis, ou seeja, não mudam
 */
public class Programa41 {
	public static void main(String[] args) {
		String curso = "Programação em Java: Essencial";
		
		//curso = curso.replace("a", "o");
		//Altera, se eoncontrar, a primerira palavraa pela segunda
		
		//curso = curso.toLowerCase();//Converte as letras maiuscula em minusculo
		//System.out.println(curso);
		
		//curso = curso.toUpperCase(); 		
		//System.out.println(curso);
		//System.out.println(nova);
		
		//System.out.println(curso.charAt(2));
		
//		for(int i = 0; i < curso.length(); i++) {
//			System.out.print(curso.charAt(i));
//		}
		
		for(int i = (curso.length() - 1); i >= 0; i--) {
			System.out.print(curso.charAt(i));
		}
	}

}
