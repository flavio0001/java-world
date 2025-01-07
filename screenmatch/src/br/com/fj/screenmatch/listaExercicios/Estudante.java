package br.com.fj.screenmatch.listaExercicios;

public class Estudante implements Comparable<Estudante> {
    private String nome;
    private double nota;
    private int idade;

    public Estudante(String nome, double nota, int idade) {
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public int compareTo(Estudante outro) {
        // Ordem natural: pelo nome
        return this.nome.compareTo(outro.getNome());
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                ", idade=" + idade +
                '}';
    }
}
