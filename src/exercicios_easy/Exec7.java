package exercicios_easy;

import javax.swing.*;

public class Exec7 {
    public double ir(double salario, double ir) {

        if (salario >= 00.00 && salario <= 1903.98) {
            System.out.println("insento do imposto de renda : ");
        }

        if (salario >= 1903.99 && salario <= 2826.65) {
            ir = (salario * 0.15) - 354.80;
        }

        if (salario >= 3751.06 && salario <= 24664.68) {
            ir = (salario * 0.275) - 636.13;
        }

        if (salario > 4664.68) {
            ir = (salario * 0.275) - 869.36;
        }
        System.out.println("salario bruto : " + salario);
        System.out.println("salario liquido : " + (salario - ir));
        System.out.println("imposto a pagar : " + ir);

        return ir;



 //   ___________________________________________________________________________________________________
//    public static void main(String[] args) {
//        double inss, salario;
//        salario = Integer.parseInt(JOptionPane.showInputDialog("Digite seu salario"));
//
//        if (salario <= 1045.00) {
//
//            inss = salario * 0.075;
//            System.out.println("O Valor que você de inss será:" + inss);
//        }
//
//        if (salario >= 1045.01 && salario <= 2089.60) {
//
//            inss = salario * 0.09;
//            System.out.println("O Valor que você de inss será:" + inss);
//        }
//
//        if (salario >= 2089.61 && salario <= 3134.40) {
//            inss = salario * 0.12;
//            System.out.println("O Valor que você de inss será:" + inss);
//        }
//
//        if (salario >= 3134.41) {
//            inss = salario * 0.14;
//            System.out.println("O Valor que você de inss será:" + inss);
//        }

    }
}


//Inicio Algoritmo
//Declarar variável do numérico: salario, inss;
//salario = Ler(1045);
//SE(salario &lt;= 1045.00)
//inss = salario * 0.075;
//
//Exibir: (“O Valor que você de inss será: ”+ inss);
//Fim se
//SE(salario &gt;= 1045.01 &amp;&amp; salario&lt;= 2089,60)
//inss = salario * 0.09;
//
//Exibir: (“ O valor de Inss será: ”+ inss);
//Fim se
//SE(salario &gt;= 2089,61 &amp;&amp; salario&lt;=3134.40)
//inss = salario * 0,12;
//
//Exibir: (“O valor de Inss será: ”+ inss);
//Fim se
//SE(salario &gt;= 3134.41)
//inss = salario * 0.14;
//
//Exibir: (“O Valor que você de inss será: ”+ inss);
//Fim Se
//Fim Algoritmo