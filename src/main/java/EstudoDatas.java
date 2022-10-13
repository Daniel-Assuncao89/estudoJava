import java.time.LocalDate;

public class EstudoDatas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate natal = LocalDate.of(2022, 12, 25);
        System.out.println(natal);

        System.out.println(hoje.isAfter(natal));
        System.out.println(hoje.isBefore(natal));

        int ano = hoje.getYear();
        int mes = hoje.getMonthValue();
        int dia = hoje.getDayOfMonth();

        int diasParaNatal = natal.getDayOfYear() - hoje.getDayOfYear();

        System.out.println(ano);
        System.out.println(mes);
        System.out.println(dia);

        System.out.println("Faltam " + diasParaNatal + "dias p/ natal!!");
    }
}
