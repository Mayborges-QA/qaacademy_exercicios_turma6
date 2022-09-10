package exercicios_easy;


import javax.swing.*;

public class Exec10A {
    public static void main(String[] args) {
        double valorInvestido, taxaJuros =0.05*10, valorJuros, valorTotal;
        valorInvestido = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor investido"));
        valorJuros = valorInvestido *taxaJuros;
        valorTotal = valorInvestido+valorJuros;
        System.out.println("Você investiu:"+ " " + valorInvestido);
        System.out.println("Rendeu:" + " " + valorJuros + " " + "de Juros");
        System.out.println("O Valor total é:" + " " + valorTotal);

    }
}


//Exibir: “Rendeu : ”+valorJuros + “de Juros”;
//Exibir: “O Valor total são : ”+valorTotal;

//Inicio Algoritmo
//Declarar Variavel do tipo numerica: valorInvestimento, taxaJuros = 0.05,
//valorJuros, valorTotal;
//valorInvestimento = Ler (1000,00);
//taxajuros = 0.05 * 10; //0.50 ou 50%
//valorJuros = valorInvestimento * taxajuros;
//// 500,00. valorTotal = valorTotal = valorJuros+valorInvestimento;
//Exibir: “Você investiu: ”+valorInvestimento;
//Exibir: “Rendeu : ”+valorJuros + “de Juros”;
//Exibir: “O Valor total são : ”+valorTotal;
//Fim Algoritmo