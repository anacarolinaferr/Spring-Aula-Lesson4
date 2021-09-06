package com.dh.meli.w3.oo.lesson4_Exercitando;

public class Cliente implements AutenticaUsuario{

    private Autenticacao autenticacao;

    public Cliente(String login, String senha) {
        autenticacao = new Autenticacao(login, senha);
    }

    @Override
    public boolean autentica(String login, String senha) {
        if(login.equals(autenticacao.getLogin()) && senha.equals(autenticacao.getSenha()))
            return true;
        else
            return false;
    }
}
