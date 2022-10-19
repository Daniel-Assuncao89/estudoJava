/**
 * 1) Crie uma classe Circulo que possui:
 * 	* Atributos: raio, cor.
 * 	* Construtores:
 * 		- Cria circulos com base no parâmetro raio do construtor;
 * 		- Cria círculos de raio 1;
 * 	* Métodos:
 * 		- calcularArea() => deve retornar double (PI * RAIO * RAIO)
 * 		- calcularCircunferencia => deve retornar double (2 * PI * RAIO)
 * 		- mudarRaio(double novoRaio) => deve alterar o valor do raio
 */
package exercicios.poo;

public class Circulo {
    private double raio;
    private String cor;

    Circulo(){
        this.raio = 1;
        this.cor = "Azul";
    }

    Circulo(double raio, String cor){
        this.raio = raio;
        this.cor = cor;
    }



    public double calcularArea(){
        return 3.1415 * Math.pow(this.raio, 2);
    }

    public double calcularCircunferencia(){
        return 2 * 3.1415 * this.raio;
    }

    public void setMudarRaio(double novoRaio){
        this.raio = novoRaio;
    }

}
