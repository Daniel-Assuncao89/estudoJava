package exercicios.poo;

public class Comida {
    private String food;
    private double peso;



    public Comida(String food, double peso){
        this.food = food;
        this.peso = peso;
    }

    public String getFood(){
        return this.food;
    }
    public double getPeso(){
        return this.peso;
    }
    void setNomeAlimento(String nome, double peso){
        this.food = nome;
    }
    void setPeso(double peso){
        this.peso = peso;
    }

}
