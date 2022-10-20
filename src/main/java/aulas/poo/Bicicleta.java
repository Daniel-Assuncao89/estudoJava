package aulas.poo;

public class Bicicleta {
    private int marcha, velocidade;

    public Bicicleta(int marcha, int velocidade){
        this.marcha = marcha;
        this.velocidade = velocidade;
    }

    @Override
    public String toString() { // retornar a representação do objeti em string
        return "Bicicleta(marcha= " + this.marcha + ", " + "velocidade" + this.velocidade + ")";
    }

    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta(21, 0);
        System.out.println(bicicleta);
    }
}
