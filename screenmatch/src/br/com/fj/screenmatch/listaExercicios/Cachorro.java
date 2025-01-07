package br.com.fj.screenmatch.listaExercicios;

public class Cachorro extends Animal{
    private String cor;
    private String peso;

    public Cachorro(String nome, String raca, int idade, String cor, String peso) {
        super(nome, raca, idade);
        this.cor = cor;
        this.peso = peso;
    }

    @Override
    public String emitirSom() {
        return "Cachorro faz: auauau";
    }

    @Override
    public String toString() {
        return super.toString() + ", Cor: " + cor + ", Peso: " + peso;
    }
}
