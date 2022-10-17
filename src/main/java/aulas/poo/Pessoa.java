package aulas.poo;

public class Pessoa {
    // Propriedades/atributos de uma Pessoa
    String nome;
    String sobrenome;
    int idade;
    double altura;
    double peso;

    Pessoa(){ // construtor de classe.
        // this => representa o objeto

        this.nome = "José";
        this.sobrenome = "Carlos";
        this.idade = 29;
        this.peso = 55.0;
        this.altura = 1.65;
    }

    Pessoa(String nome, String sobrenome, int idade, double altura, double peso) { // construtor de classe dinamico. a ordem dos tipos das variaveis fazem diferença na construção de outros contrutoes.
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    Pessoa(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = 0;
        this.altura = 0.5;
        this.peso = 3;
    }

    //Ações de uma pessoa (métodos)
    // <tipo_retorno> nomeDoMetodo(PARAMETROS)
    void dizOla(){
        System.out.println("Olá, tudo bem? ");
    }

    void mostrarImc(){
       // double imc = this.peso / (this.altura * this.altura);
        double imc = this.calculaImc();
        System.out.println("O meu IMC é: " + imc);
    }

    double calculaImc(){
        double imc = this.peso / (this.altura * this.altura);
        return imc;
    }

    void comer(String comida){
        System.out.println("Estou comendo " + comida);
    }
}
