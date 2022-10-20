package exercicios.poo;

public class BichinhoTeste {
    public static void main(String[] args) {
        Bichinho teste = new Bichinho("Michel", 1, 4);

        Comida alimento1 = new Comida("Banana", 0.5);
        Comida diversos = new Comida("Jujuba", 0.7);

        teste.getListaAlimentos();
        System.out.println(diversos.getFood());


        System.out.println(teste.getEstaDormindo());
        teste.comer(alimento1);
        System.out.println(teste.getPesoBichinho());
        teste.comer(diversos);
        System.out.println(teste.getPesoBichinho());
        teste.getListaAlimentos();

    }

}
