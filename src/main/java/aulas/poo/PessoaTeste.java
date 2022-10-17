package aulas.poo;

// intuito: testar o uso da classe Pessoa
public class PessoaTeste {
    public static void main(String[] args) {
        // new => constrói um novo objeto de Pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "José";
        pessoa1.sobrenome = "Carlos";
        pessoa1.idade = 29;
        pessoa1.peso = 55.0;
        pessoa1.altura = 1.65;

        System.out.println(pessoa1.idade);
        pessoa1.dizOla();

        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        System.out.println(pessoa2.nome);

        Pessoa pessoa4 = new Pessoa ("Pedro", "Gomes", 35, 1.75, 30.5);

        Pessoa recemNascido = new Pessoa("Enzo", "Gomes");

        System.out.println(recemNascido.altura);
        recemNascido.idade++;
        recemNascido.dizOla(); // o metodo pode ser chamado por qualquer objeto-filho criado a partir do objeto-pai

        pessoa4.mostrarImc();
        double imcPessoa4 = pessoa4.calculaImc();
        System.out.println(imcPessoa4);

        pessoa4.comer("Poke");
    }
}
