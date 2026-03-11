package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;
// O import abaixo é redundante se você já usou o model.*, mas não tem problema deixar
import br.com.fiapride.model.Baleia;

public class SistemaPrincipal {
    public static void main(String[] args) {

        System.out.println("--- Iniciando o Sistema FiapRide --- \n");

        // Criando os passageiros (O construtor já faz o setNome e setCpf internamente)
        Passageiro passageiro1 = new Passageiro("Ana Silva", "222.222.222-22");
        System.out.println(">>> Recarga Passageiro 1:");
        passageiro1.adicionarSaldo(50.0);

        Passageiro passageiro2 = new Passageiro("Carlos Souza", "333.333.333-33");
        System.out.println(">>> Recarga Passageiro 2:");
        passageiro2.adicionarSaldo(12.5);


        System.out.println("\n--- Status dos Passageiros (Usando Getters) ---");
        // ATENÇÃO: Mudamos de .nome para .getNome(), de .saldo para .getSaldo(), etc.
        System.out.println("Passageiro: " + passageiro1.getNome() + " | Saldo: R$ " + passageiro1.getSaldo() + " | CPF: " + passageiro1.getCpf());
        System.out.println("Passageiro: " + passageiro2.getNome() + " | Saldo: R$ " + passageiro2.getSaldo() + " | CPF: " + passageiro2.getCpf());

        System.out.println("\n--- Realizando Viagens ---");
        System.out.println("Pagando viagem da " + passageiro1.getNome());
        passageiro1.pagarViagem(20); // Ana tem 50, sobra 30.

        System.out.println("Pagando viagem do " + passageiro2.getNome());
        passageiro2.pagarViagem(20); // Carlos tem 12.5, o método vai bloquear e avisar "Saldo insuficiente".


        // TESTE DE HACKER (Se você descomentar a linha abaixo, o código nem compila!)
        // passage1.saldo = 9999; // ERRO: saldo has private access in Passageiro
    }
}