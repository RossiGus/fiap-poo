package br.com.fiapride.main;

import br.com.fiapride.model.Animal;
import br.com.fiapride.model.Baleia;
import br.com.fiapride.model.Golfinho;
import br.com.fiapride.model.Migracao;
import br.com.fiapride.model.Oceano;

public class TesteBaleia {

    public static void main(String[] args) {

        System.out.println("=== Iniciando o Sistema de Migração Marinha ===\n");

        Oceano pacifico = new Oceano("Pacífico", 15.5);
        Oceano atlantico = new Oceano("Atlântico", 20.0);

        Baleia baleia = new Baleia("Tarik", "cinza", pacifico);
        Golfinho golfinho = new Golfinho("Flipper", "azul", true);

        System.out.println("--- Crescimento ---");
        baleia.crescer(18);
        golfinho.crescer(6);

        System.out.println("\n--- Status dos Animais ---");
        System.out.println("Nome: " + baleia.getNome() + " | Cor: " + baleia.getCor() + " | Tamanho: " + baleia.getTamanhoEmMetros() + "m | Oceano: " + baleia.getOceano().getNome());
        System.out.println("Nome: " + golfinho.getNome() + " | Cor: " + golfinho.getCor() + " | Tamanho: " + golfinho.getTamanhoEmMetros() + "m | Treinado: " + golfinho.isTreinado());

        System.out.println("\n--- Migrações ---");
        Migracao migracaoBaleia = new Migracao(baleia, atlantico, 5000.0);
        migracaoBaleia.iniciarMigracao();

        Migracao migracaoGolfinho = new Migracao(golfinho, pacifico, 800.0);
        migracaoGolfinho.iniciarMigracao();

        System.out.println("\n--- Teste de Validação: temperatura inválida ---");
        try {
            Oceano oceanoInvalido = new Oceano("Fantasma", 999.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== Sistema encerrado. ===");
    }
}