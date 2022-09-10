package exercicio_medium;

import javax.swing.*;

public class Exec5B {
    public static void main(String[] args) {
        int numeroDigitado, menor=0;
        for (int i =0; i<5; i++){
            numeroDigitado= Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
            if (i==0) {
                menor = numeroDigitado;
            }
            if (numeroDigitado <menor) {
                menor = numeroDigitado;

            }
        }
        System.out.println("O numero menor é: " + menor) ;
    }
}
