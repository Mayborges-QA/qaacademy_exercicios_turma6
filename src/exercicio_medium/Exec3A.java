package exercicio_medium;

import javax.swing.*;

public class Exec3A {
    public static void main(String[] args) {
        int num, i=0, soma=1;
        num= Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        while (i<=1000){
                    soma = i + soma;
            if (soma >= 1500)
                break;
            System.out.println("A soma é:" + soma);
            i++;
        }

        }
    }

    //Inicio Algoritmo
//Declarar variável do tipo numerico: i=0, soma;
//Enquanto(i&lt;=1000 )
//soma = i+soma;
//Se(soma&gt;= 1500)
//break; //parar
//
//Fim Se
//Exibir(soma);
//i++; //i = i+1;
//Fim Enquanto
//Exibir(soma);



//Exercício 3 - Faça um algoritmo para calcular e exibir a soma de todos os
//números de 0 a 1000. E parar se caso a soma atingir 1500(ou mais).
