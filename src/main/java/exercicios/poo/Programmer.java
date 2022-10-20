package exercicios.poo;

public class Programmer extends Person{

    private String companyName;

    Programmer(String name, String designation, String companyName){
        super(name, designation);

        this.companyName = companyName;
    }

    @Override
    public void learn() {
        System.out.println("Programmer is learning");
    }

    @Override
    public void walk() {
        System.out.println("Programmer is walking");
    }

    @Override
    public void eat() {
        System.out.println("Programmer is eating");
    }

    public void coding(){
        System.out.println("Progammer was at home, coding");
    }
}
