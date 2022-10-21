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



    public void Sistema(Notificador msg){
        this.notificador = msg;
    }

    public void alertaSistema(){
        System.out.println(notificador + "ALERTA!");
    }

    public void sobreCargaSistema(){
        System.out.println(notificador + "Sobrecarga Sistema");
    }

}
