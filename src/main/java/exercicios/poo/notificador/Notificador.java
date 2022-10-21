package exercicios.poo.notificador;

public interface Notificador {
    void notificar(String msg);
}

class EmailNotificador implements Notificador{
    private String email;

    EmailNotificador(String email){
        this.email = email;
    }

    @Override
    public void notificar(String msg) {
        System.out.println("Notificação email: " + msg);
    }
}

class TelefoneNotificador implements Notificador{

    private int numero;
    TelefoneNotificador(int numero){
        this.numero = numero;
    }

    @Override
    public void notificar(String msg) {
        System.out.println("Notificação Telefone: " + msg);
    }
}

class InstagramNotificacao implements Notificador{

    private String nomeUsuario;

    InstagramNotificacao(String nomeUsuario){
        this.nomeUsuario = nomeUsuario;
    }

    @Override
    public void notificar(String msg) {
        System.out.println("Notificacao Instagram " + msg);
    }

}

class Sistema{
    Notificador notificador;

    Sistema(Notificador notificador){
        this.notificador = notificador;
    }

    public void alertaSistema(){
        notificador.notificar("Alerta");
    }

    public void sobreCargaSistema(){

        notificador.notificar("Sobrecarga Sistema");
    }

    public static void main(String[] args) {
        InstagramNotificacao instagram = new InstagramNotificacao("Daniel");
        TelefoneNotificador telefone = new TelefoneNotificador(9100000);
        EmailNotificador email = new EmailNotificador("consegui@gmail.com");

        Sistema t1 = new Sistema(instagram);
        Sistema t2 = new Sistema(telefone);
        Sistema t3 = new Sistema(email);

        t1.alertaSistema();
        t1.sobreCargaSistema();

        t2.alertaSistema();
        t2.sobreCargaSistema();

        t3.alertaSistema();
        t3.sobreCargaSistema();

    }

}
