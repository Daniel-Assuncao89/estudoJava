package aulas.poo;

public class Calculadora {

    public static double PI = 3.14;
    public static double soma(double a, double b){
        return a + b;
    }

    public static double subtracao(double a, double b){
        return a - b;
    }

    public static double multiplicacao(double a, double b){
        return a * b;
    }

    public static double divisao(double a, double b){
        return a / b;
    }

    public static void main(String[] args) {
        double resultadoSoma = Calculadora.soma(1,2);
        double resultadoSub = Calculadora.subtracao(5,2);
        double resultadoMult = Calculadora.multiplicacao(4,4);
        double resultadoDiv = Calculadora.divisao(10, 5);

        System.out.println(resultadoSoma);
        System.out.println(Calculadora.PI);
    }
}
