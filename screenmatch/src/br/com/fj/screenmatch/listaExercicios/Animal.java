package br.com.fj.screenmatch.listaExercicios;

public class Animal {
    private String nome;
    private String raca;
    private int idade;

    public Animal(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String emitirSom() {
        return"Animal faz som: ";
    }

    @Override
    public String toString() {
        return "Animal [nome: " + nome + ", Raça: " + raca + ", Idade: " + idade + "]";
    }
}
