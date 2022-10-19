package exercicios.poo;

public class CirculoTeste {
    public static void main(String[] args) {
        Circulo teste = new Circulo();

        Circulo teste2 = new Circulo(4.5, "Verde");

        System.out.println(teste.calcularArea());
        System.out.println(teste.calcularCircunferencia());
        System.out.println("============");
        System.out.println(teste2.calcularArea());
        System.out.println(teste2.calcularCircunferencia());
        teste2.setMudarRaio(10);
        System.out.println("============");
        System.out.println(teste2.calcularArea());
        System.out.println(teste2.calcularCircunferencia());
    }
}
