package exercicios_easy;

import javax.swing.*;

public class Exec10C {
    public static void main(String[] args) {
        double valorInvestido, taxaJuros = 0.05, valorJuros = 0, valorTotal = 0, i = 1;
        valorInvestido = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor investido"));
        while (i <= 10) {
            valorJuros = ((valorInvestido + valorJuros) * taxaJuros) + valorJuros;
            i = i + 1;
        }
        System.out.println("Você investiu:" + " " + valorInvestido);
        System.out.println("Rendeu:" + " " + valorJuros + " " + "de Juros");
        System.out.println("O Valor total é:" + " " + (valorInvestido+valorJuros));
    }
}

