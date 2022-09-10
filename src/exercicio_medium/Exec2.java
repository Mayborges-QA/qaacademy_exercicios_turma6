package exercicio_medium;

import javax.swing.*;

public class Exec2{
    public static void main(String[] args) {
        double valorInvestido, taxaJuros = 0.05, valorJuros = 0, i = 1;
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

//Declarar Variavel do tipo numerica: valorInvestimento,
//taxaJuros = 0.05, valorJuros, valorTotal, i =1, valorJuros;
//valorInvestimento = Ler (“1000,00”);
//valorTotal = valorInvestimento;
//Enquanto (i&lt;=10)
//valorTotal = (valorTotal*taxaJuros) +valorTotal;
//i=i+1; //i++
//Fim Enquanto
//valorJuros = valorTotal - valorInvestimento;
//Exibir: “Você investiu: ”+valorInvestimento;
//Exibir: “Rendeu : ”+valorJuros + “de Juros”;
//Exibir: “O Valor total são : ”+valorTotal;