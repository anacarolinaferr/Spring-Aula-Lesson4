package com.dh.meli.w3.oo.lesson4_Exercitando;

import com.dh.meli.w3.oo.lesson4.Cliente;
import com.dh.meli.w3.oo.lesson4_Exercitando.CalculaSalario;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.NumberFormat;

public class Main {

	public static void main(String[] args) throws IOException {
		Funcionario kenyo = new Funcionario("kenyo", "m", 3000.895);
		Funcionario mauri = new Funcionario("mauri", "m", 5000.588);
		Funcionario joice = new Funcionario("joice", "f", 7000);
		Funcionario filipe = new Funcionario("filipe", "m", 10000);
		Gerente thiago = new Gerente("thiago", "m", 13000);
		Vendedor ana = new Vendedor("ana carolina", "f", 20000, 100000);


		Desenvolvedor joao = new Desenvolvedor("Joao","m",6500,"joaodev@mail.com", "123456");
		Cliente cliente = new Cliente("cliente@mail.com", "123456");

		boolean autenticaJoao = joao.autentica("joaodev@mail.com", "123456");
		boolean autenticaCliente = cliente.autentica("cliente@mail.com", "123456");

		System.out.println("autenticacao do Joao: " + autenticaJoao);
		System.out.println("autenticacao do cliente: " + autenticaCliente);

		Funcionario[] funcionarioArray = new Funcionario[7];
		funcionarioArray[0] = kenyo;
		funcionarioArray[1] = mauri;
		funcionarioArray[2] = joice;
		funcionarioArray[3] = filipe;
		funcionarioArray[4] = thiago;
		funcionarioArray[5] = ana;
		funcionarioArray[6] = joao;

		CalculaSalario calcula = new CalculaSalario();
		double total = calcula.calculaSalario(funcionarioArray);
		System.out.println("Total da folha: "+NumberFormat.getCurrencyInstance().format(total).replaceAll("\\u00A0", ""));

	}
}
