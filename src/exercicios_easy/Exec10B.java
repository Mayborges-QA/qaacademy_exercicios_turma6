package exercicios_easy;

import javax.swing.*;

public class Exec10B {

    public static void main(String[] args) {
        double valorInvestido, taxaJuros = 0.05, valorJuros = 0, valorTotal = 0, i = 1;
        valorInvestido = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor investido"));
        while (i <= 10) {
            valorJuros = valorInvestido * taxaJuros + valorJuros;
            valorTotal = valorInvestido + valorJuros;
            i = i + 1;
        }
        System.out.println("Você investiu:" + " " + valorInvestido);
        System.out.println("Rendeu:" + " " + valorJuros + " " + "de Juros");
        System.out.println("O Valor total é:" + " "+ valorTotal);
    }
}
//Inicio Algoritmo
//
//Declarar variáveis tipo numero: investimento, taxa =0,05, valorJuros=0,
//valorTotal=0;i=1;
//Investimento = Ler(1000);
//Enquanto(i&lt;=10)
//valorJuros = investimento*taxa+valorJuros
//i =i+1;
//fim enquanto
//exibir(“Valor juros: ” + valorJuros);
//exibir(“Valor investido: ” + investimento);
//
//exibir(“Valor total: ” + investimento+valorJuros);
//Fim Algoritmo