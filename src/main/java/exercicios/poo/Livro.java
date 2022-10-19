package exercicios.poo;

public class Livro {
    String nome, autor;
    double preco;

    Livro (String nome, String autor, double preco){
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    public void criarLivros(){
        System.out.println("Livro: " + this.nome + "\nAutor: " + this.autor + "\nPreço: " + this.preco);
    }
}
