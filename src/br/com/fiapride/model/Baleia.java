package br.com.fiapride.model;


    public class Baleia {

        private String cor;
        private String nome;
        private double tamanhoEmMetros;

        public Baleia(String nome, String cor) {
            this.setNome(nome);
            this.setCor(cor);
            this.setTamanhoEmMetros(2.0);
        }


        public String getNome() {
            return this.nome;
        }

        public String getCor() {
            return this.cor;
        }

        public double getTamanhoEmMetros() {
            return this.tamanhoEmMetros;
        }


        private void setNome(String nome) {
            this.nome = nome;
        }

        private void setCor(String cor) {
            this.cor = cor;
        }

        private void setTamanhoEmMetros(double novoTamanho) {
            if (novoTamanho > 2.0) {
                this.tamanhoEmMetros = novoTamanho;
            } else {
                System.out.println("Erro: A baleia não cresceu: verificar o que aconteceu!");
            }
        }



        public void crescer(double tempo) {
            if (tempo <= 0) {
                System.out.println("A baleia não cresceu: pouco tempo se passou.");
                return;
            }

            double novoTamanho = this.tamanhoEmMetros + (tempo * 0.5);

            setTamanhoEmMetros(novoTamanho);

            System.out.println("A baleia cresceu! Novo tamanho: " + this.getTamanhoEmMetros() + "m");
        }

        public boolean migrar(double distancia) {
            if (distancia <= 3) {
                System.out.println("A distância é muito curta para uma migração.");
                return false;
            }
            System.out.println(this.nome + " iniciou sua migração de " + distancia + "km.");
            return true;
        }
    }
