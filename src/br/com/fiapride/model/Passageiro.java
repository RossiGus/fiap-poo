package br.com.fiapride.model;

public class Passageiro {

    private String nome;
    private String cpf;
    private double saldo;

    // CONSTRUTOR: Agora usa os setters para garantir que as regras sejam aplicadas desde o início
    public Passageiro(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSaldo(0);
    }

    // --- MÉTODOS DE ACESSO (GETTERS E SETTERS) ---

    public String getNome() {
        return this.nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return this.saldo;
    }

    // Note que o setSaldo é PRIVATE. Só a própria classe Passageiro pode mudar o saldo diretamente.
    private void setSaldo(double valor) {
        if (valor >= 0) {
            this.saldo = valor;
        } else {
            System.out.println("Erro de Segurança: Tentativa de definir saldo negativo bloqueada!");
        }
    }

    // --- MÉTODOS DE REGRA DE NEGÓCIO ---

    public void adicionarSaldo(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor de recarga deve ser maior que zero.");
            return;
        }
        // Em vez de "this.saldo += valor", usamos o setter para manter o padrão
        setSaldo(this.saldo + valor);
        System.out.println("Recarga realizada. Novo saldo: " + this.getSaldo());
    }

    public void pagarViagem(double custo) {
        if (custo <= 0) {
            System.out.println("Erro: O custo da viagem é inválido.");
            return;
        }
        if (this.saldo < custo) {
            System.out.println("Erro: Saldo insuficiente.");
            return;
        }
        // Usamos o setter aqui também
        setSaldo(this.saldo - custo);
        System.out.println("Viagem paga. Saldo restante: " + this.getSaldo());
    }
}