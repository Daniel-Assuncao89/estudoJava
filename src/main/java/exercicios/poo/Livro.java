package exercicios.poo;

public class Livro {
    private String nome;

    private Autor autor;
    private double preco;

    Livro (String nome, Autor autor, double preco){
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    public void criarLivros(){
        System.out.println("Livro: " + this.nome + "\nAutor: " + this.autor + "\nPreço: " + this.preco);
    }

    public static void main(String[] args) {
        Autor jk = new Autor("jk", "jk@hot");
        Livro camaraSecreta = new Livro("Camara Secreta", jk, 29.90);

        System.out.println(camaraSecreta.autor.getNome());

        Livro prisioneiro = jk.escreverLivro("HP: azkaban", 50);



    }
}
