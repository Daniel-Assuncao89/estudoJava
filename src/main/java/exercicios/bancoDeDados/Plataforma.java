package exercicios.bancoDeDados;

public class Plataforma {
    private int idPlataforma;
    private String plataformaNome, plataformaLancamento;

    Plataforma(int idPlataforma, String plataformaLancamento, String plataformaNome){
        this.idPlataforma = idPlataforma;
        this.plataformaNome = plataformaNome;
        this.plataformaLancamento = plataformaLancamento;
    }

    public int getIdPlataforma() {
        return idPlataforma;
    }

    public void setIdPlataforma(int idPlataforma) {
        this.idPlataforma = idPlataforma;
    }

    public String getPlataformaNome() {
        return plataformaNome;
    }

    public void setPlataformaNome(String plataformaNome) {
        this.plataformaNome = plataformaNome;
    }

    public String getPlataformaLancamento() {
        return plataformaLancamento;
    }

    public void setPlataformaLancamento(String plataformaLancamento) {
        this.plataformaLancamento = plataformaLancamento;
    }
}
