package org.aplicacao;

import org.aplicacao.servico.ApiServico;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApiServico apiServico = new ApiServico();

        System.out.println(apiServico.getEndereco("01001000"));

    }
}