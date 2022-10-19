package exercicios.poo;

import exercicios.poo.Bichinho;

import java.util.ArrayList;

public class Comida {
    private String nomeComida;
    private double peso;

    public Comida(String nomeComida, double peso){
        this.nomeComida = nomeComida;
        this.peso = peso;
    }

    public String getNomeComida(){
        return this.nomeComida;
    }
    public double getPeso(){
        return this.peso;
    }
    void setNomeAlimento(String nome){
        this.nomeComida = nome;
    }
    void setPeso(double peso){
        this.peso = peso;
    }

}
