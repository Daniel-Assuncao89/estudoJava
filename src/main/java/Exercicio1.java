/*
1) Escreva um programa que exiba as seguintes opções e realize os que se pede em cada uma delas: (switch-case)

1 – Adição
2 – Subtração
3 – Multiplicação
4 – Divisão
 */
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double a, b, c;

        System.out.println("Selecione a operação:\n" + "1) Adição\n" + "2) Subtração\n" + "3) Multiplicação\n" + "4) Divisão\n");
        int valor = entrada.nextInt();

        switch (valor){
            case 1:
                System.out.println("Inserir o valor 1 para somar");
                a = entrada.nextDouble();
                System.out.println("Inserir o valor 2 para somar");
                b = entrada.nextDouble();
                c = a + b;
                System.out.println("calculo: " + c);
                break;
            case 2:
                System.out.println("Inserir o valor 1 para subtrair");
                a = entrada.nextDouble();
                System.out.println("Inserir o valor 2 para subtrair");
                b = entrada.nextDouble();
                c = a - b;
                System.out.println("calculo: " + c);
                break;
            case 3:
                System.out.println("Inserir o valor 1 para multiplicar");
                a = entrada.nextDouble();
                System.out.println("Inserir o valor 2 para multiplicar");
                b = entrada.nextDouble();
                c = a * b;
                System.out.println("calculo: " + c);
                break;
            case 4:
                System.out.println("Inserir o valor 1 para dividir");
                a = entrada.nextDouble();
                System.out.println("Inserir o valor 2 para dividir");
                b = entrada.nextDouble();
                c = a / b;
                System.out.println("calculo: " + c);
                break;
            default:
                System.out.println("Opção invalida");
        }

    }
}
