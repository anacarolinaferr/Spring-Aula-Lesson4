package com.dh.meli.w3.oo.lesson4_Exercitando;

public class Desenvolvedor extends Funcionario implements AutenticaUsuario{

    private Autenticacao autenticacao;

    public Desenvolvedor(String nome, String sexo, double salario, String login, String senha) {
        super(nome, sexo, salario);
        autenticacao = new Autenticacao(login,senha);
    }

    @Override
    public boolean autentica(String login, String senha) {
        if(login.equals(autenticacao.getLogin()) && senha.equals(autenticacao.getSenha()))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
