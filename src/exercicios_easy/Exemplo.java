package exercicios_easy;

import javax.swing.*;

public class Exemplo {//incio da classe
    public static void main(String[] args) {//
        String nome;
        int numero1,numero2;
        nome = (JOptionPane.showInputDialog("Digite um nome"));
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

        System.out.println(nome+numero1+numero2);// Exibi

    }
}// Fechamento da classe
