package exercicios_easy;

import javax.swing.*;

public class Exec3 {
    public static void main(String[] args) {

        String nome, sobrenome;
        nome = JOptionPane.showInputDialog ("Digite seu nome");
        sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome");
        System.out.println("Seu nome completo é:" + sobrenome +" "+ nome);

    }
}

//Declarar variáveis do tipo texto : nome, sobrenome;
//nome = Ler(“Silas”);
//sobrenome = Ler(“Leão”);
//Exibir: “O nome é ” + sobrenome + nome;
//Fim Algoritmo