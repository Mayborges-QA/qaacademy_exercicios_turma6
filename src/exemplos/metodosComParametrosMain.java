package exemplos;

public class metodosComParametrosMain {
    public static void main(String[] args) {
        texto("ExemploA", "ExemploB");
        numero(10, 5);
        soma(10, 5);
        divisao(10, 6, 2);
        porcentagem(10, 10, 0.05);
        System.out.println(textoA("ExemploA", "ExemploB"));
        System.out.println(numero1(10, 5));
        System.out.println(soma1(10, 5));
        System.out.println(divisao1(10, 6, 2));
        System.out.println(porcentagem1(10, 10, 0.05));

    }

    public static void texto(String a, String b) {
        System.out.println("O texto é " + a + b);

    }

    public static void numero(int num1, int num2) {
        System.out.println("O numero é " + num1 + num2);

    }

    public static void soma(int num1, int num2) {
        System.out.println("A Soma é " + (num1 + num2));

    }

    public static void divisao(int num1, int num2, int num3) {
        System.out.println("A divisão é " + ((num1 + num2) / num3));

    }

    public static void porcentagem(int num1, int num2, double num3) {
        System.out.println("A porcentagem é " + ((num1 + num2) * num3));

    }

    public static String textoA (String num1, String num2) {
        return num1 + num2;

    }

    public static int numero1(int num1, int num2) {
        return num1 + num2;

    }

    public static int soma1(int num1, int num2) {
        return num1 + num2;

    }

    public static int divisao1(int num1, int num2, int num3) {
        return ((num1 + num2) / num3);

    }

    public static double porcentagem1(int num1, int num2, double num3) {
        return ((num1 + num2) * num3);

    }
}
