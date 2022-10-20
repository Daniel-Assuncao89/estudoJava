package exercicios.poo;

public class Manager extends Employee{
    double bonus;

    Manager(String name, double salary, int age, double bonus){
        super(name, age, salary);

        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        double v = super.getSalary() + this.bonus;
        return v;
    }

    public static void main(String[] args) {
        Manager gerente = new Manager("Fred", 1240, 25, 500);

        System.out.println(gerente.getSalary());
        System.out.println(gerente.getAnualSalary());
        gerente.downSalary(145);
        System.out.println(gerente.getAnualSalary());
    }

}
