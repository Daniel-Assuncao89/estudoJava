package exercicios.poo;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado teste = new Empregado("Fernanda", "Da Silva", 1340.4);

        teste.nomeCompleto();
        System.out.println("Salario: "+ teste.getSalario());
        System.out.println("Salario Anual: "+ teste.calcularSalarioAnual());
        teste.setAumentarSalario(200);
        System.out.println("Salario após o aumento: "+ teste.getSalario());
    }

}
