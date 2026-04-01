package br.com.fiapride.main;

import br.com.fiapride.model.Baleia;

public class TesteBaleia {
    public static void main(String[] args) {

        System.out.println(" --- Teste Sistema Baleia --- ");


        Baleia baleia1 = new Baleia("Tarik", "cinza");
        Baleia baleia2 = new Baleia(10.0, pacifico);

        System.out.println("\nA baleia " + baleia1.getNome() + " de cor " + baleia1.getCor() + " nasceu!");
        System.out.println("Tamanho inicial: " + baleia1.getTamanhoEmMetros() + "m");

        System.out.println("\nA baleia Tarik está com 18 meses de vida...");

        baleia1.crescer(18);

        baleia1.migrar(7);

        System.out.println("\n--- Status Final da Baleia ---");

        System.out.println("Nome: " + baleia1.getNome());
        System.out.println("Cor: " + baleia1.getCor());
        System.out.println("Tamanho Atual: " + baleia1.getTamanhoEmMetros() + "m");

        Oceano pacifico = new Oceano("Pacífico", 15.5);
        

        System.out.println("A baleia vive no oceano: " + baleia2.getOceano().getNome());
        System.out.println("Temperatura média do oceano: " + baleia2.getOceano().getTemperaturaMedia() + "°C");

    }
}