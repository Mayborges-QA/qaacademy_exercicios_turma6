package exercicio_medium;

import javax.swing.*;

public class Exec8B {
    public static void main(String[] args) {
        String [] mes = new String [12];
        int numeroMes;
        mes [0] = "Janeiro";
        mes [1] = "Fevereiro";
        mes [2] = "Março";
        mes [3] = "Abril";
        mes [4] = "Maio";
        mes [5] = "Junho";
        mes [6] = "Julho";
        mes [7] = "Agosto";
        mes [8] = "Setembro";
        mes [9] = "Outubro";
        mes [10] = "Novembro";
        mes [11] = "Dezembro";

       numeroMes= Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        int i=1;
        //while (i<12){// ou i<meses.length //   que ele ja entende o tamanho
            System.out.println(" o mes é: " + mes[numeroMes-1]);
        JOptionPane.showMessageDialog (null, mes[numeroMes-1], "O mês que você vai ficar Milhonario é " + " ",1, new ImageIcon("C:\\Users\\mayara.ferreira\\Desktop\\milho.gif"));
         //   i++;
        }
    }


