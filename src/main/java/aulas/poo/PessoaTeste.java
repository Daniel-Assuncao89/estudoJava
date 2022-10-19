package aulas.poo;

// intuito: testar o uso da classe Pessoa
public class PessoaTeste {
    public static void main(String[] args) {
        // new => constrói um novo objeto de Pessoa
        Pessoa pessoa1 = new Pessoa();


        pessoa1.dizOla();

        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();


        Pessoa pessoa4 = new Pessoa ("Pedro", "Gomes", 35, 1.75, 30.5);

        Pessoa recemNascido = new Pessoa("Enzo", "Gomes");



        recemNascido.dizOla(); // o metodo pode ser chamado por qualquer objeto-filho criado a partir do objeto-pai

        pessoa4.mostrarImc();
        double imcPessoa4 = pessoa4.calculaImc();
        System.out.println(imcPessoa4);

        pessoa4.comer("Poke");

        // Exemplo pessoas
        Pessoa pedro = new Pessoa("Pedro", "José", 29, 1.8, 80);
        Pessoa joao = new Pessoa("Joao", "Carlos", 30, 1.75, 90);

        pedro.cumprimentar(joao);
        joao.cumprimentar(pedro);
    }
}
