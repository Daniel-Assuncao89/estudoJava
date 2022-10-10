public class Variaveis {
    public static void main(String[] args){
        System.out.println("Hello, world");

        // Variaveis no JAVA
        // Fortemente tipado e estaticamente tipado
        int idade = 20; //inteiro
        double salario = 4500.99;
        float nota = 7.5f;
        long populacaoTerra = 7_900_000_000l;
        boolean tarefaConcluida = false;
        int i = 1, j = 0, k = 1000;
        String nomeCompleto = "José Almir";

        int teste = 10;
        teste = 9;

        final int teste2 = 200; // impossivel mudar o valor

        //Operadores
        int a = 10;
        int b = 5;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a + b;
        int divisao =  a / b;

        System.out.println("O resultado da soma é: " + soma);

        // Math
        double x = Math.sqrt(144);
        double y = Math.pow(5, 2);
        System.out.println(Math.PI);

        int pi2 = (int) Math.PI; // Casting
        System.out.println(pi2);

        double resultado3 = 7 / (double) 2;

        //Operadores 2
        int valor = 5;
        valor++; //tbm pode incrementar antes da variavel
        valor--;
        valor += 10;

        // Operadores relacionais
        boolean teste1 =  5 > 1;
        boolean teste3 = 5 < 1;
        boolean teste4 = 5 == 5;
        boolean teste5 = 5 != 1;
        boolean teste6 = 6 >= 6;
        boolean teste7 = 5 <= 9;

        // Operadores logicos
        boolean teste8 = true && false;
        boolean teste9 = true || false;
        boolean teste10 = !teste9; //operador de negacao
    }
}
