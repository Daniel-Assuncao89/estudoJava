package aulas.poo;

import java.time.LocalDate;

public class Cliente {
    private int id;
    private String nome, sobrenome;
    private LocalDate dataNascimento;
    private double altura;
    private double peso;

    Cliente (int id, String nome, String sobrenome, LocalDate dataNascimento, double altura, double peso){
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
    }

    public void crescer(){
        this.altura += 0.2;
    }

    //Getter => possibilitam a leitura dos atributos
    public String getNome(){
        return this.nome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }

    public String getSobrenomeCompleto() {
        return this.nome + " " + this.sobrenome;
    }

    // Setter =>
    public void setAltura(double altura){
        if(altura < 2.51){
            this.altura = altura;
        } else {
            System.out.println("Altura invalida. Atributo não modificado");
        }
    }

    public void setPeso(double novoPeso){
        if(novoPeso >= 150 || novoPeso <= 40){
            System.out.println("Peso invalido, favor inserir um peso entre 40kg-150kg");
        } else{
            this.peso = novoPeso;
        }

    }
}
