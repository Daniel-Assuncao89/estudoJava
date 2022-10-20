package exercicios.poo;

import aulas.poo.Pet;

public class Gato extends Pet {
    private String raca;

    public Gato(String nome, int idade, double peso, String raca){
        super(nome, idade, peso);
        this.raca = raca;

    }

    @Override
    public void fazerSom() {
        System.out.println("Miaaau");
    }

    @Override
    public void brincar() {
        this.fazerSom();
        super.brincar();
    }

    public void ronronar(String raca){
        if(raca.equals(this.raca)){
            System.out.println("PRRRRRRRRR");
        } else {
            System.out.println("GRRRRRRRRR");
        }
    }

    public static void main(String[] args) {
        Gato gato1 = new Gato("Furiosa", 6, 5.5, "Maine Coon");

        gato1.ronronar("Maine Coon");
        gato1.brincar();
    }
}
