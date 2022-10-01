package exercicios_easy;

import javax.swing.*;

public class Exec6 {
    public String calcularMedia(int nota1, int nota2) {
        int media;
        String retorno = "";
        media = (nota1 + nota2) / 2;

        if (media > 5) {
            retorno = "Aprovado";
        }
        if (media < 5) {
            retorno = "Reprovado";
        }
        if (media ==5){
            retorno = "Exame";
        }
        return retorno;
    }

//
//    public static void main(String[] args) {
//        int nota1, nota2, media;
//        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota1"));
//        nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota1"));
//        media = (nota1+nota2 /2);
//
//        if (media>5) {
//            System.out.println("Aprovado");
//        }
//        if (media==5) {
//            System.out.println("Exame");
//        }
//        if (media<5) {
//            System.out.println("Reprovado");
//        }
//
//               }
}
