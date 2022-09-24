package exercicios_easy;

import javax.swing.*;

public class Exec5 {
    public String soma (int num1, int num2, int num3){
      //  int result = num1+ num2+ num3;
        return "A soma é " + num1+num2+num3;

    }
    public String subtracao (int num1, int num2, int num3) {
        int result = num1 - num2 - num3;
        return "A subtração é " + result;
    }
    public String multiplicacao (int num1, int num2, int num3) {
        int result = num1 * num2 * num3;
        return "A multiplicacao é " + result;
    }

    public String media (int num1, int num2, int num3) {
        int result = (num1 + num2 + num3)/3;
        return "A media é " + result;
    }

}

//
//    //Anterior
//    public static void main(String[] args) {
//        int numero1, numero2, numero3, soma, subtração,multiplicação, media;
//        //Declarar variáveis numéricas: numero1, numero2 e numero3;
//        //Declarar variáveis numéricas: soma, subtração, multiplicação, media;
//        numero1 = Integer.parseInt( JOptionPane.showInputDialog("Digite um numero"));
//        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
//        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
//        soma = numero1 + numero2 + numero3;
//        subtração = numero1 - numero2 - numero3;
//        multiplicação = numero1 * numero2 * numero3;
//        media = soma / 3;
//        System.out.println ("A soma dos números digitados é:" + soma);
//        System.out.println ("A subtração dos números digitados é:" + subtração);
//        System.out.println ("A multiplicacaodos números digitados é:" + multiplicação);
//        System.out.println ("A media dos números digitados é:" + media);
//
//
//    }
//}
//Inicio Algoritmo
//Declarar variáveis numéricas: numero1, numero2 e numero3;
//Declarar variáveis numéricas: soma, subtração, multiplicação, media;
//
//numero1 = Ler(10);
//numero2 = Ler(20);
//numero3 = Ler(30);
//soma = numero1 + numero2 + numero3;
//subtracao = numero1 - numero2 - numero3;
//multiplicacao = numero1 * numero2 * numero3;
//media = soma / 3;
//Exibir: “A soma dos números digitados é: ”+soma;
//Exibir: “A subtração dos números digitados é: ”+ subtração;
//Exibir: “A multiplicacaodos números digitados é: ” +multiplicacao;
//Exibir: “A media dos números digitados é: ” +media;
