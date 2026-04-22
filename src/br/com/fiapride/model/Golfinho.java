package br.com.fiapride.model;

public class Golfinho extends Animal {

    private boolean treinado;

    public Golfinho(String nome, String cor, boolean treinado) {
        super(nome, cor);
        this.treinado = treinado;
    }

    public boolean isTreinado() {
        return treinado;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " emite: Eeeee-eeee!");
    }
}