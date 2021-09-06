package com.dh.meli.w3.oo.lesson4_Exercitando;

public class Autenticacao {
    private String login;
    private String senha;

    public Autenticacao(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
}
