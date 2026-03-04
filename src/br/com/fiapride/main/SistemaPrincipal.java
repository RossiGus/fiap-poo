package br.com.fiapride.main;

import br.com.fiapride.model.*;
import br.com.fiapride.model.Baleia;

public class SistemaPrincipal {
    public static void main(String[] args) {

        Passageiro passageiro1 = new Passageiro("Ana Silva", "222");
        System.out.println("Regarga passageiro 1");

        passageiro1.adicionarSaldo(50.0);

        Passageiro passageiro2 = new Passageiro("Carlos Souza", "333");
        System.out.println("Regarga passageiro 2");
        passageiro2.adicionarSaldo(12.5);

        Baleia baleia1 = new Baleia("Tarik", "cinza");
        System.out.println("A baleia Tarik esta com 6 meses de vida");
        System.out.println("Ela iniciou sua primeira migracao");

        baleia1.crescer(6);
        baleia1.migrar(7);

        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$ " + passageiro1.saldo + " | CPF: " + passageiro1.cpf);
        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$ " + passageiro2.saldo + " | CPF: " + passageiro2.cpf);

        System.out.println("Pagando viagem do passageiro 1");
        passageiro1.pagarViagem(20);
        System.out.println("Pagando viagem do passageiro 2");
        passageiro2.pagarViagem(20);

        System.out.println("Baleia: " + baleia1.nome + " | cor: R$ " + baleia1.cor + " | tamanho: " + baleia1.tamanhoEmMetros);
    }
}