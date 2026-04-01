public class Oceano {
    private String nome;
    private double temperaturaMedia; // em °C

    public Oceano(String nome, double temperaturaMedia) {
        this.nome = nome;
        this.temperaturaMedia = temperaturaMedia;
    }

    public String getNome() {
        return nome;
    }

    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }
}