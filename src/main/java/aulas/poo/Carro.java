package aulas.poo;

public class Carro {
    String modelo, marca;
    int ano, qtdPortas;
    boolean ehFlex, estaLigado;
    double combustivelAtual, consumo;

    Carro(String modelo, String marca, int ano, boolean ehFlex, int qtdPortas, double consumo){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.ehFlex = ehFlex;
        this.qtdPortas =qtdPortas;
        this.combustivelAtual = 30.0;
        this.consumo = consumo;
    }

    void abastecer(double total){
        this.combustivelAtual += total;
    }

    void ligar(){
        this.estaLigado = true;
    }
    void desligar(){
        this.estaLigado = false;
    }

    boolean viajar(String local, double distancia){
        if(!this.estaLigado){
            this.ligar();
        }
        double totalLitros = distancia /this.consumo;

        if(this.combustivelAtual - totalLitros > 0){
        this.combustivelAtual -= totalLitros;
            System.out.println("Viagem: " + local + "e Sobrou: " + this.combustivelAtual);
            return true;
        } else {
            System.out.println("A viagem nao foi possivel");
            return false;
        }
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("XY", "Ferrari", 2019, true, 4, 40);

        System.out.println(carro1.combustivelAtual);
        carro1.abastecer(5);
        System.out.println(carro1.combustivelAtual);
    }
}

