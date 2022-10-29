package exercicios.bancoDeDados;

public class Jogo {
    private int idJogo;
    private String genero, titulo, jogoLancamento;

    Jogo(int idJogo, String genero, String titulo, String jogoLancamento){
        this.idJogo = idJogo;
        this.genero = genero;
        this.titulo = titulo;
        this.jogoLancamento = jogoLancamento;
    }

    public int getIdJogo() {
        return idJogo;
    }

    public void setIdJogo(int idJogo) {
        this.idJogo = idJogo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getJogoLancamento() {
        return jogoLancamento;
    }

    public void setJogoLancamento(String jogoLancamento) {
        this.jogoLancamento = jogoLancamento;
    }
}

