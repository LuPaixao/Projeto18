package br.com.geekuniversity.secao18;
//Object : A mãe de todas as classes

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

/*
  A classe Object, faz parte do pacote java.lang
  
 */
public class Programa39 {
	public static void main(String[] args) {
		
		Cliente cli1 = new Cliente(19, "Ronaldo Robson", "Rua 1, 345");
		Cliente cli2 = new Cliente(23, "Felipe Cláudio", "Rua 2, 845");

		
		Conta c1 = new Conta(1, 200, 300, cli1);
		Conta c2 = new Conta(2, 200, 300, cli2);
		
		Caixa prateleira = new Caixa();
		
		System.out.println(c1);
		System.out.println(c2);
		
		if(c1.equals(cli1)) {
			System.out.println("São as msm contas");
		}else {
			System.out.println("São diferentes");
		}
		
		prateleira.adicionar(c1); //0 -> tem getSaldo
		prateleira.adicionar(c2); //1-  > tem getSaldo
		
		//Conta conta = prateleira.pegar(0);
		
		System.out.println(((Conta)prateleira.pegar(0)).getSaldo()); //Cast

		prateleira.adicionar(cli1); //-> tem getSaldo
		
		System.out.println(((Cliente)prateleira.pegar(2)).getNome()); //Cast
		
		if(c1 instanceof Conta) {
			System.out.println("O objeto é do tipo conta");
		}
	}

}
