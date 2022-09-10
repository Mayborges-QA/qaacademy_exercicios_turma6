package exercicio_medium;

import javax.swing.*;

public class Exec3B {

    public static void main(String[] args) {
        int num, i=0, soma;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        soma= num+i;
        while (i <= 1000 && soma <= 1500) {
            soma = i + soma;
            System.out.println("A soma é: " + soma);
            i++;
        }
    }
}


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