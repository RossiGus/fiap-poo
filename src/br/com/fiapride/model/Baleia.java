package br.com.fiapride.model;

public class Baleia extends Animal {

    private Oceano oceano;

    public Baleia(String nome, String cor, Oceano oceano) {
        super(nome, cor);
        setOceano(oceano);
    }

    public Oceano getOceano() {
        return oceano;
    }

    private void setOceano(Oceano oceano) {
        if (oceano == null) {
            throw new IllegalArgumentException("Erro: O oceano não pode ser nulo.");
        }
        this.oceano = oceano;
    }

    public boolean migrar(double distanciaKm) {
        if (distanciaKm <= 3) {
            System.out.println("Erro: A distância é muito curta para uma migração.");
            return false;
        }
        System.out.println(getNome() + " iniciou sua migração de " + distanciaKm + "km.");
        return true;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " emite: Woooooom...");
    }
}