package br.com.fj.screenmatch.listaExercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoEstudantes {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("Ana", 8.5, 20));
        estudantes.add(new Estudante("João", 9.0, 22));
        estudantes.add(new Estudante("Maria", 7.8, 19));
        estudantes.add(new Estudante("Carlos", 9.5, 21));

        // Ordenação usando Comparable (Por nome)
        System.out.println("Antes da ordenação por nome:");
        System.out.println(estudantes);
        Collections.sort(estudantes);
        System.out.println("Depois da ordenação (por nome):");
        System.out.println(estudantes);

        // Ordenação usando Comparator (Por nota, ordem decrescente)
        estudantes.sort(Comparator.comparing(Estudante::getNota).reversed());
        System.out.println("Depois da ordenação (por nota - decrescente):");
        System.out.println(estudantes);

        // Ordenação usando Comparator (Por idade, ordem crescente)
        estudantes.sort(Comparator.comparing(Estudante::getIdade));
        System.out.println("Depois da ordenação (por idade - crescente):");
        System.out.println(estudantes);
    }
}
