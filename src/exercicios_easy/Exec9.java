package exercicios_easy;

import javax.swing.*;

public class Exec9 {
    public static void main(String[] args) {
        int numeroDigitado, i = 1;
        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        while (i <= 10){
        System.out.println(numeroDigitado + "x" + i + "=" + numeroDigitado * i);
        i++;// = i + 1; Incremento
        }

    }
}

//Inicio Algoritmo
//Declarar variável do tipo numérico: numeroDigitado, i = 1;
//numeroDigitado = Ler(5);
//Enquanto(i&lt;=10)
//Exibir: “Numero ”+numeroDigitado + “ x ”+ i +“ = ” + numeroDigitado * i;
//i=i+1;
//Fim Enquanto
//Fim Algoritmo

