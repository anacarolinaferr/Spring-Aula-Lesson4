package com.dh.meli.w3.oo.lesson4_Exercitando;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Funcionario{

	private String nome;
	private String sexo;
	private Double salario;

	private static DecimalFormat df = new DecimalFormat("#.##");

	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String sexo, double salario) {
		this.nome = nome;
		this.sexo = sexo;
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}

	public String getNome() {
		return nome.toUpperCase();
	}
	
	public String getSexo() {
		return sexo;
	}
	
	@Override
	public String toString() {
		return nome + "         " + sexo + "        " + NumberFormat.getCurrencyInstance().format(salario).replaceAll("\\u00A0", "");
	}
}
