package exercicios_easy;

public class Exec11 {
    public String somaMais2CemVezes(int numero) {
        int i=1;
        while (i <= 100) {
            numero = numero + 2;
            i++;
        }
        return "A Soma é" + numero;
    }
}
//    public static void main(String[] args) {
//int num, i=1;
//num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
//while (i<= 100){
//    System.out.println("A soma é:" + num );
//num = (num+2);
//i=i+1;}
//
//    }
//}

//Inicio Algoritmo
//Declarar variáveis do tipo numérico num, i=1;
//num = Ler(6);
//Enquanto(i&lt;=100)
//num = num +2;
//Exibir(“A soma é:” + num);
//i =i+1;
//Fim enquanto
//Fim Algoritmo

//Exercícios nível:
//
//Exercício 1 - Faça um algoritmo para verificar e exibir de 0 a 100, quais são os
//números Pares e ímpares.


//Exercício 2 - Faça um algoritmo para ler um valor de investimento, com uma taxa
//        de juros de 5% a.a. Ao final de 10 anos, exibir o valor investido, valor dos juros, e
//        o total. Considerando que a remuneração será no regime de juros compostos.