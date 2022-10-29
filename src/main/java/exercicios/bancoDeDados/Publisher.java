package exercicios.bancoDeDados;

public class Publisher {
    private int idPublisher;
    private String publisherNome, publisherLocal, publisherFoundation;

    Publisher(int idPublisher, String publisherNome, String publisherLocal, String publisherFoundation){
        this.idPublisher = idPublisher;
        this.publisherNome = publisherNome;
        this.publisherLocal = publisherLocal;
        this.publisherFoundation = publisherFoundation;
    }

    public int getIdPublisher() {
        return idPublisher;
    }

    public void setIdPublisher(int idPublisher) {
        this.idPublisher = idPublisher;
    }

    public String getPublisherNome() {
        return publisherNome;
    }

    public void setPublisherNome(String publisherNome) {
        this.publisherNome = publisherNome;
    }

    public String getPublisherLocal() {
        return publisherLocal;
    }

    public void setPublisherLocal(String publisherLocal) {
        this.publisherLocal = publisherLocal;
    }

    public String getPublisherFoundation() {
        return publisherFoundation;
    }

    public void setPublisherFoundation(String publisherFoundation) {
        this.publisherFoundation = publisherFoundation;
    }
}
