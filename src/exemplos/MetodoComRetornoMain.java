package exemplos;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MetodoComRetornoMain {
    public static void main(String[] args) {
        System.out.println(vendas()+" "+ Joias()+" "+MaryKay()+" "+Eudora()+" "+Natura());// assim quando quiser exibir tudo junto
        //Se quiser separado tem que colocar um sout para cada um
        //String Cidade1 = saoPaulo(); armazena em uma variavel
        //Sout (Cidade1);


    }
    public static String vendas(){
        return "Vendas";
    }
    public static String Joias() {
        return "joias";
    }
    public static String MaryKay(){
        return "Mary Kay";
    }
    public static String Eudora(){
        return "Eudora";
    }
    public static String Natura(){
        return "Natura";
    }

}
