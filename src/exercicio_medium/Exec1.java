package exercicio_medium;

public class Exec1 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i%2);//Se quiser mostrar a prova real
                System.out.println("O numero " + i + " é par");
            }
            else{
                System.out.println(i%2);//Se quiser mostrar a prova real
                System.out.println("O numero " + i + " é Impar");
                }
            i++;
            }
        }
    }





//Inicio Algoritmo
//
//Declarar variável do inteiro: i=0;
//
//Enquanto(i<=100){//iniciando enquanto
//SE(i%2==0){
//  Exibir(“O numero ”+i+” é par”)
//        }//fim se
//
//SE Não{
// Exibir(“O numero ”+i+” é impar”)
//}//Fim senão
//i++; // i=i+1
//}fim Enquanto
//Fim Algoritmo