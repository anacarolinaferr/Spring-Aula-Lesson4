package com.dh.meli.w3.oo.lesson4.lesson4_excecoes;

public class Classe3 {

	private Funcionario funcionario;

	public void metod3() throws NullPointerException{
		System.out.println("executando o metodo 3");
		System.out.println("salario do diretor: " + funcionario.getSalario());
		System.out.println("finalizando o metodo 3");
	}

}
