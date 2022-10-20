package exercicios.poo;

import java.util.ArrayList;

public class Bichinho {
    private String nomeBichinho;
    private int idade;
    private boolean estaDormindo;
    private double pesoBichinho;

    ArrayList<Comida> bucho = new ArrayList<>();


    Bichinho(String nome, int idade, double pesoBichinho){
        this.estaDormindo = false;
        this.nomeBichinho = nome;
        this.idade = idade;
        this.pesoBichinho = pesoBichinho;
    }

    public void comer(Comida comida){ //precisa armazenar a string inserida.
        if(bucho.contains(comida) || estaDormindo ){
            System.out.println("Não come comida repetida ou esta dormindo!");
        } else {
            this.bucho.add(comida);
            this.pesoBichinho +=  0.5;
        }
    }

    public void setAcordar(){
        this.estaDormindo = false;
    }
    public boolean getEstaDormindo(){
        return this.estaDormindo;
    }
    public void setDormir(int horas){
        this.estaDormindo = true;
        if((horas >= 1 && horas < 10) && this.pesoBichinho > 0){
            this.pesoBichinho *= (((double) horas * 10)/100);
        } else {
            System.out.println("Valor de horas invalido ou Bichinho sem peso suficiente");
        }
    }
    double getPesoBichinho(){
        return this.pesoBichinho;
    }

    public void getListaAlimentos(){
        System.out.printf("bucho");
        for (Comida b: bucho) {
            System.out.printf("[" + b +"] ");
        }
    }


}

