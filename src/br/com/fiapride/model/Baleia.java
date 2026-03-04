package br.com.fiapride.model;
public class Baleia {

    public String cor;
    public String nome;
    public double tamanhoEmMetros;

    public Baleia (String nome, String cor){
        this.nome = nome;
        this.cor = cor;
        this.tamanhoEmMetros = 3;
    }
    public void crescer(double tempo){
        if (tempo <= 0) {
            System.out.println("A baleia nao esta crescendo, algo aconteceu.");
        }
        else{
            System.out.println("A baleia esta crescendo perfeitamente");
        }
        this.tamanhoEmMetros += tempo*0.5;
        System.out.println("O tamanho atual da baleia e: " + this.tamanhoEmMetros);
    }
    public boolean migrar(double distancia) {
        if (distancia <= 3) {
            System.out.println("A baleia nao esta migrando");
            return false; // Retorna falso para o main
        } else {
            System.out.println("A baleia iniciou sua migracao");
            return true; // Retorna verdadeiro para o main
        }
    }

}