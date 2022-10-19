package exercicios.poo;

public class Empregado {
    private String nome, sobrenome;
    private double salario;

    Empregado (String nome, String sobrenome, double salario){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    public double calcularSalarioAnual(){
        return this.salario * 12;
    }

    public void setAumentarSalario(double aumento){
        this.salario += aumento;
    }

    public void nomeCompleto(){
        System.out.println("Nome Completo: " + this.nome + " " + this.sobrenome);
    }

    public double getSalario(){
        return this.salario;
    }
}
