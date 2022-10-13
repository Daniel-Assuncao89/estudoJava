import java.util.Scanner;

public class EstudoStrings {
    public static void main(String[] args) {
        // Strings são cadeias de caracteres
        String nome = "Pedro";

        if (nome == "Pedro"){ //compara o endereço
            System.out.println("São iguais");
        }

        System.out.println("Digite seu sobrenome");
        Scanner entrada =  new Scanner(System.in);
        String sobrenome = entrada.nextLine();

        /*
        if (sobrenome == "Pereira"){
            System.out.println("Iguais");
        } else {
            System.out.println("Diferente");
        }
        */

        //sobrenome.equalsIgnoreCase("pereira") //ignora maiusculo e minusculo

        if (sobrenome.equals("Pereira")){
            System.out.println("Iguais");
        } else {
            System.out.println("Diferente");
        }

        String java = "Java";
        String ja = java.substring(0, 2);
        String va = java.substring(2);

        System.out.println(ja);
        System.out.println(va);

        String m1 = "Hello, ";
        String m2 = "World!";
        String m3 = m1.concat(m2);
        System.out.println(m3);

        System.out.println(java.length());
        System.out.println(java.isEmpty()); // Verifica se esta vazio.
        System.out.println(java.toUpperCase());

        String data = "13/10/2022";
        String[] valores = data.split("/");
        System.out.println(valores[0]);



    }
}
