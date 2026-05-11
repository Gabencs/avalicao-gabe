public class Calculadora {

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int subtracao(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        int resultadoSoma = soma(10, 5);
        int resultadoSubtracao = subtracao(10, 5);

        System.out.println("Resultado da soma: " + resultadoSoma);
        System.out.println("Resultado da subtração: " + resultadoSubtracao);
    }
}