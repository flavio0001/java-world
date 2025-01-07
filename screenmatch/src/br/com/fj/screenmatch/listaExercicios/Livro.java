package br.com.fj.screenmatch.listaExercicios;

public class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public int compareTo(Livro outro) {
        return Integer.compare(this.numeroDePaginas, outro.numeroDePaginas);
    }

    @Override
    public String toString() {
        return titulo + " - " + numeroDePaginas + " páginas";
    }
}
