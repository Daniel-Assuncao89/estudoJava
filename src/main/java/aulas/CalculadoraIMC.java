package aulas;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = entrada.nextLine();

        System.out.println("Qual sua idade?");
        int idade = entrada.nextInt();

        System.out.println("Qual sua altura (m)");
        double altura = entrada.nextDouble();

        System.out.println("Qual seu peso? (kg)");
        double peso = entrada.nextDouble();

        // IMC = peso / altura^2

        double imc = peso / Math.pow(altura, 2);

        System.out.println("Olá, meu nome é: " + nome + " e tenho " + idade + " anos!");
        System.out.println("Este é o seu IMC = " + imc);
        System.out.printf("Este é o seu IMC = %.2f \n", imc); //representa apenas 2 casas decimais
        System.out.printf("Olá, meu nome é %s e tenho %d anos! \n", nome, idade);

        if (imc < 17){
            System.out.println("Muito abaixo do peso");
        } else if (imc >= 17 && imc <= 18.49){
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.99){
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc <= 34.99){
            System.out.println("Acima do peso");
        } else if (imc >= 35 && imc <= 34.99){
            System.out.println("Obesidade I");
        } else if (imc >= 35 && imc <= 39.99){
            System.out.println("Obesidade II (severa)");
        } else {
            System.out.println("Obesidade III (mórbida)");
        }

        System.out.println("Selecione uma dieta (1 a 3) \n" + "1 - Agua\n" + "2 - Fruta\n" + "3 - Batata");
        int dieta = entrada.nextInt();

        switch (dieta) {
            case 1:
                System.out.println("Dieta da Agua");

                break;
            case 2:
                System.out.println("Dieta da Fruta");
                break;
            case 3:
                System.out.println("Dieta da Batata");
                break;
            default:
                System.out.println("Número invalido");
        }
        /* //Outra forma de declarar switch case
        switch (dieta) {

            case 1 -> System.out.println("Dieta da Agua");
            case 2 -> System.out.println("Dieta da Fruta");
            case 3 -> System.out.println("Dieta da Batata");
            default -> System.out.println("Número invalido");
        } */

        System.out.println("Você tem quantos alimentos favoritos?");
        int totalAlimentos = entrada.nextInt();
        String[] alimentos = new String[totalAlimentos] ;

        for (int i = 0; i < totalAlimentos; i++){
            System.out.println("Insira a comida " + i + ":");
            alimentos[i] = entrada.next();
        }
        for (int i = 0; i < totalAlimentos; i++){
            System.out.println(alimentos[i]);
        }

        int i = 0;
        while(i < totalAlimentos){
            System.out.println(i);
            i++;
        }
    }
}
