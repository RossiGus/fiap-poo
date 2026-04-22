package br.com.fiapride.model;

public class Migracao {

    private Animal animal;
    private Oceano oceanoDestino;
    private double distanciaKm;

    public Migracao(Animal animal, Oceano oceanoDestino, double distanciaKm) {
        setAnimal(animal);
        setOceanoDestino(oceanoDestino);
        setDistanciaKm(distanciaKm);
    }

    public Animal getAnimal() {
        return animal;
    }

    public Oceano getOceanoDestino() {
        return oceanoDestino;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    private void setAnimal(Animal animal) {
        if (animal == null) {
            throw new IllegalArgumentException("Erro: O animal da migração não pode ser nulo.");
        }
        this.animal = animal;
    }

    private void setOceanoDestino(Oceano oceanoDestino) {
        if (oceanoDestino == null) {
            throw new IllegalArgumentException("Erro: O oceano de destino não pode ser nulo.");
        }
        this.oceanoDestino = oceanoDestino;
    }

    private void setDistanciaKm(double distanciaKm) {
        if (distanciaKm <= 0) {
            throw new IllegalArgumentException("Erro: A distância da migração deve ser positiva.");
        }
        this.distanciaKm = distanciaKm;
    }

    public void iniciarMigracao() {
        System.out.println("Iniciando migração de " + animal.getNome()
            + " para o oceano " + oceanoDestino.getNome()
            + " (" + distanciaKm + "km).");
        animal.emitirSom();
    }
}