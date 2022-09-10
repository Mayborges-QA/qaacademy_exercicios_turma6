package exercicio_medium;

public class Exec8 {
    public static void main(String[] args) {
        String [] mes = new String [12];
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
        int i=1;
        while (i<12){// ou i<meses.length //   que ele ja entende o tamanho
            System.out.println(mes[i]);
            i++;
        }
    }
}

//Outra forma
//for (int i=0; i<12; i++){ //no lugar while
//outra forma
//for (String mes : meses);{   Sout (mes);

