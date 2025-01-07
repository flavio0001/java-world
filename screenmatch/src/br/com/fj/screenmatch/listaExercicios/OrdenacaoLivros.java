package br.com.fj.screenmatch.listaExercicios;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoLivros {
    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro("Livro A", "Autor A", 200));
        livros.add(new Livro("Livro B", "Autor B", 150));
        livros.add(new Livro("Livro C", "Autor C", 300));

        System.out.println("Antes da ordenação: " + livros);
        Collections.sort(livros);
        System.out.println("Depois da ordenação: " + livros);
    }
}
