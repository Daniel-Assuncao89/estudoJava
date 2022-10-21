package aulas.poo.zoo;

// Na interface voc~e define um conjunto de metodos
// E a classe que herda deve implementar estes metodos
public interface Animal {
    void dormir();
    void fazerSom();
    void comer(String comida);
}

class Gato implements Animal{
    @Override
    public void dormir() {

    }

    @Override
    public void fazerSom() {

    }

    @Override
    public void comer(String comida) {
        if(comida.equals("Peixe")){
            System.out.println("Hummm gosto de peixe");
        } else {
            System.out.println("Só como Peixe");
        }
    }
}

class Galinha implements Animal {
    @Override
    public void dormir() {
        System.out.println("Có có zzz");
    }

    @Override
    public void fazerSom() {
        System.out.println("Có có có");
    }

    @Override
    public void comer(String comida) {
        System.out.println("Humm có có " + comida);
    }

    public static void main(String[] args) {
        Galinha galinha = new Galinha();
        Gato gato = new Gato();


        galinha.fazerSom();
        galinha.dormir();
        galinha.comer("Milho");

        gato.fazerSom();
        gato.comer("Peixe");
    }

}