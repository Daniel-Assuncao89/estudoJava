import java.util.ArrayList;

public class EstudoListas {
    public static void main(String[] args){
        // ArrayList<WrapperClass> [nomeVariavel] = new ArrayList<>();
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();
        System.out.println(numeros);

        numeros.add(10); //equivalente ao push JS
        numeros.add(20);
        numeros.add(1000);
        System.out.println(numeros);
        System.out.println(numeros.get(2)); // acessar posicao especifica.

        numeros.set(0, 500); // alterar posicao especifica.
        System.out.println(numeros);

        numeros.remove(0);
        System.out.println(numeros);

        numeros.add(1, 200); // adiciona o elemento na posicao e move os demais a direita.
        System.out.println(numeros);

        numeros.add(3, 600);
        System.out.println(numeros);

        System.out.println(numeros.size()); // verificar tamanho do array

        for (int i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        }

        System.out.println("-------FOR EACH-------");

        // usar valores somente para verificação, for each executa para cada valor dentro do array.
        for (int numero: numeros) {
            System.out.println(numero);
        }

        System.out.println(numeros.contains(500)); // return true or false;
        System.out.println(numeros.indexOf(1000)); // qdo valor nao existe, retorna -1.
        System.out.println(numeros.lastIndexOf(200)); // mostra o ultimo encontrado.
    }
}
