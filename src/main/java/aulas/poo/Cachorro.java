package aulas.poo;

public class Cachorro extends Pet {
    private String comidaFavorita, raca;

    public Cachorro(String nome, int idade, double peso, String comidaFavorita, String raca){
        // representa a classe Pet
        super(nome, idade, peso); // chamando o construtor da superclasse.
        this.comidaFavorita = comidaFavorita;
        this.raca = raca;
    }

    @Override //sobrescrever a ação de fazer som
    public void fazerSom() {
        System.out.println("Au Au Au");
    }

    @Override
    public void brincar() {
        this.fazerSom(); // Chama fazerSom do cachorro, foi sobescrito
        super.brincar(); // esta chamando brincar() de pet
        this.dormir(); // chama o dormir do Pet, pois nao foi sobrescrito.
    }

    @Override
    public void comer(String comida) { // customizando a forma de comer
        if(comida.equals(this.comidaFavorita)){ // verifica se é a comida favorita
            super.comer(comida);
        } else {
            System.out.println("Quero " + comida + " não");
        }
    }

    public void correrAtrasMoto(){ // metodo especifico do cachorro
        this.fazerSom();
        System.out.println("Correndo atras da moto");
    }

    public static void main(String[] args) {
        // Testar a herança

        Pet pet1 = new Pet("Fred", 3, 12.5);

        pet1.dormir();
        pet1.comer("Feijao");
        pet1.fazerSom();

        System.out.println(" =========== ");

        Cachorro batata = new Cachorro("Rex", 5, 25, "Osso", "Bulldog");
        batata.dormir();
        batata.fazerSom();
        batata.comer("Ovo");
        batata.setPeso(20);
        batata.brincar();
        batata.comer("Osso");
    }
}
