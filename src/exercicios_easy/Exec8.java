package exercicios_easy;

import javax.swing.*;

public class Exec8 {

    public static void main(String[] args) {
        double salario, imposto = 0;
        salario = Integer.parseInt(JOptionPane.showInputDialog("Digite seu salario"));

        if (salario > 0 && salario <= 1903.98)
                System.out.println("Isento de imposto de renda");
        else
        {

        if (salario >= 1903.99 && salario <= 2826.65) {
        imposto = (salario * 0.075) - 142.80;
        }

        if (salario >= 2826.66 && salario <= 3751.05) {
        imposto = (salario * 0.15) - 354.80;
        }

        if (salario >= 3751.05 && salario <= 4664.68) {
        imposto = (salario * 0.225) - 636.13;
        }

        if (salario >= 4664.69) {
        imposto = (salario * 0.275) - 869.36;
        }

        System.out.println("salario Bruto:" + salario);
        JOptionPane.showMessageDialog (null, salario, "Seu Salario é" + " ",1, new ImageIcon("C:\\Users\\mayara.ferreira\\Desktop\\dinheiro.gif"));

        System.out.println("salario Liquido:" + (salario - imposto));
        JOptionPane.showMessageDialog(null, (salario - imposto), "Seu Salario Liquido é"+" ", 1);
        System.out.println("Imposto a pagar:" + imposto);
        JOptionPane.showMessageDialog(null, imposto, "Imposto a pagar:", 1);

        }

    }

}

//Exibir“Salario Bruto: ” + salario;
//Exibir“Salario Liquido: ” + (salario - ir);
//Exibir“Imposto a pagar: ” + i);


//Inicio Algoritmo
//Declarar variavel do tipo numerica: salario, ir;
//salario = Ler(5000,00);
//SE(salario &gt; 0 &amp;&amp; salario &lt;= 1903,98 )
//Exibir: (“Isento de imposto de renda”);
//
//Fim Se
//SE(salario &gt;= 1903,99 &amp;&amp; salario &lt;= 2826,65)
//ir = (salario * 0,075) - 142,80;
//Fim Se
//
//SE(salario &gt;=2826,66 &amp;&amp; salario &lt;= 3751,05)
//ir = (salario * 0,15) - 354,80;
//Fim Se
//SE(salario &gt;=3751,06 &amp;&amp; salario &lt;= 4664,68)
//ir = (salario * 0,225) - 636,13;
//Fim Se
//SE(salario &gt; 4664,68)
//ir = (salario * 0,275) - 869,36;
//Fim Se
//Exibir“Salario Bruto: ” + salario;
//Exibir“Salario Liquido: ” + (salario - ir);
//Exibir“Imposto a pagar: ” + i);
//Fim Algoritmo