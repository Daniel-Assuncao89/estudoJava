package exercicios.poo;

public class Autor {
    private String nome, email;

    Autor (String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public void setAlteraNome(String novoNome){
        this.nome = novoNome;
    }

    public void setAlteraEmail(String novoEmail){
        this.email = novoEmail;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }

    public Livro escreverLivro(String nome, double preco){
        Livro novoLivro = new Livro(nome, this, preco);
        return novoLivro;
    }
}
