package exercicios.poo;

public class Dancer extends Person{
    private String groupName;

    Dancer(String name, String designation, String groupName){
        super(name, designation);
        this.groupName = groupName;
    }

    @Override
    public void learn() {
        System.out.println("Dancer is learning");
    }

    @Override
    public void walk() {
        System.out.println("Dancer is walking");
    }

    @Override
    public void eat() {
        System.out.println("Dancer is eating");
    }

    public void dancing(){
        System.out.println("Dancing");
    }
}
