package com.dh.meli.w3.oo.lesson4.lesson4_excecoes;

public class Classe2 {

	public void metod2() throws NullPointerException, ArithmeticException{
		System.out.println("executando o metodo 2");
		try{
			int valor = 10/1;
			System.out.println("o valor da divisao eh: " + valor);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		Classe3 obj3 = new Classe3();
		obj3.metod3();
		System.out.println("finalizando o metodo 2");
		
	}

}
