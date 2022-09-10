package exercicio_medium;

import javax.swing.*;

public class Exec7B {
    public static void main(String[] args) {
        String[] vetorMeses = new String[12];
        int i = 0;

        while (i <= 11) {
            vetorMeses[i] = JOptionPane.showInputDialog("Digite um numero");
            System.out.println("Mes " + vetorMeses[i]);
            i++;
        }


    }
}
//Iniciar Algoritmo
//
//Declarar vetor do tipo texto: vetorMeses[12], i = 0;
//
//Enquanto(i<=11)
//vetorMeses[i] = Ler();
//i++;
//Fim enquanto
//
//Fim Algoritmo