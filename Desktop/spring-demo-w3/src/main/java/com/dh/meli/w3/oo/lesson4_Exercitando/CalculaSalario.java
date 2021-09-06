package com.dh.meli.w3.oo.lesson4_Exercitando;

import java.text.NumberFormat;

public class CalculaSalario {

    public double calculaSalario(Funcionario[] funcionarios){
        double total = 0;
        for(int i=0; i<funcionarios.length; i++) {
            total += funcionarios[i].getSalario();
        }
        return total;
    }
}
