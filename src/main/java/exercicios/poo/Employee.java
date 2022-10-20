package exercicios.poo;

public class Employee {
    private String name;
    private int age;
    private double salary;

    Employee(String name, int age, double salary){
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary(){
        return this.salary;
    }

    public double getAnualSalary(){
        return this.salary * 12;
    }

    public void upSalary(double increase){
        this.salary += increase;
    }

    public void downSalary(double reduction){
        this.salary -= reduction;
    }
}
