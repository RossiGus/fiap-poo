package br.com.fiapride.model;

public class Oceano {

    private String nome;
    private double temperaturaMedia;

    public Oceano(String nome, double temperaturaMedia) {
        setNome(nome);
        setTemperaturaMedia(temperaturaMedia);
    }

    public String getNome() {
        return nome;
    }

    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    private void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Erro: O nome do oceano não pode ser vazio.");
        }
        this.nome = nome;
    }

    private void setTemperaturaMedia(double temperaturaMedia) {
        if (temperaturaMedia < -2 || temperaturaMedia > 40) {
            throw new IllegalArgumentException("Erro: Temperatura média fora do intervalo oceânico válido (-2°C a 40°C).");
        }
        this.temperaturaMedia = temperaturaMedia;
    }
}