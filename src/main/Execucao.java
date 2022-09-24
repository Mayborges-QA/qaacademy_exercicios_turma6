package main;

import exemplos.MetodosSemMain;

public class Execucao {
    public static void main(String[] args) {
        MetodosSemMain Exemplo = new MetodosSemMain();

        Exemplo.empresaPiorParaSeTrabalhar();
        System.out.println(Exemplo.melhorLugarParaSeTrabalhar("Itau"));
        System.out.println(Exemplo.piorEmpresaParaSeTrabalhar("CSU"));
    }

}
