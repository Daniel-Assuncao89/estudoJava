package exercicios.poo;

public class Singer extends Person{
    String bandName;

    Singer(String name, String designation, String bandName){
        super(name, designation);
        this.bandName = bandName;
    }

    @Override
    public void learn() {
        System.out.println("Singer Learning");
    }

    @Override
    public void walk() {
        System.out.println("Singer's walking");
    }

    @Override
    public void eat() {
        System.out.println("Singer's eating");
    }

    public void singing(){
        System.out.println("Singing");
    }

    public void playGuitar(){
        System.out.println("Playing guitar");
    }
}
