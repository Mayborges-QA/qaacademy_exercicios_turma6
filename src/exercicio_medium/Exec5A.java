package exercicio_medium;

import javax.swing.*;

public class Exec5A {
    public static void main(String[] args) {
        int i = 1, anterior = 0, numeroDigitado;
        while (i <= 5) {
            numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

            if (numeroDigitado < anterior || i == 1) {
                anterior = numeroDigitado;
            }
            i++;
        }
        System.out.println("O menor digitado é: " + anterior);

    }

}
//Inicio Algoritmo
//
//        	Declarar variável numérica: i = 1, anterior,
//numeroDigitado;
//
//        	Enquanto(i<=5)
//numeroDigitado = Ler();
//Se(numeroDigitado < anterior || i==1)
//  anterior = numeroDigitado;
//Fim Se
//i++;
//        	Fim Enquanto
//
//Exibir (“O menor digitado é: ”+anterior);
//
//Fim Algoritmo