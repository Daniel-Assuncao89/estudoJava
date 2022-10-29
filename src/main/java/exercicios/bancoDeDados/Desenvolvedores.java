package exercicios.bancoDeDados;

import java.util.Date;

public class Desenvolvedores {

    private int idDesenvolvedores;
    private double desenvolvedoresSalario;
    private String desenvolvedoresNome, desenvolvedoresSetor;

    Desenvolvedores(int idDesenvolvedores, double desenvolvedoresSalario, String desenvolvedoresNome, String desenvolvedoresSetor){
        this.idDesenvolvedores = idDesenvolvedores;
        this.desenvolvedoresNome = desenvolvedoresNome;
        this.desenvolvedoresSalario = desenvolvedoresSalario;
        this.desenvolvedoresSetor = desenvolvedoresSetor;
    }

    public int getIdDesenvolvedores() {
        return idDesenvolvedores;
    }

    public void setIdDesenvolvedores(int idDesenvolvedores) {
        this.idDesenvolvedores = idDesenvolvedores;
    }

    public double getDesenvolvedoresSalario() {
        return desenvolvedoresSalario;
    }

    public void setDesenvolvedoresSalario(double desenvolvedoresSalario) {
        this.desenvolvedoresSalario = desenvolvedoresSalario;
    }

    public String getDesenvolvedoresNome() {
        return desenvolvedoresNome;
    }

    public void setDesenvolvedoresNome(String desenvolvedoresNome) {
        this.desenvolvedoresNome = desenvolvedoresNome;
    }

    public String getDesenvolvedoresSetor() {
        return desenvolvedoresSetor;
    }

    public void setDesenvolvedoresSetor(String desenvolvedoresSetor) {
        this.desenvolvedoresSetor = desenvolvedoresSetor;
    }
}
