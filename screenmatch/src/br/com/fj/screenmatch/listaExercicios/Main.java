package br.com.fj.screenmatch.listaExercicios;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //criando lista de produtos
        List<Produtos> produtos = new ArrayList<>();
        produtos.add(new Produtos("notebook - acer", 4700, 4));
        produtos.add(new Produtos("computador desktop dell", 7430, 5));
        produtos.add(new Produtos("cadeira gamer acolchoada", 640, 10));
        produtos.add(new Produtos("teclado retroiluminado gamer redragon", 450, 10));

        // Usando for tradicional
        System.out.println("For percorrendo por elementos: ");
        for (int i = 0; i < produtos.size(); i++){
            Produtos produto = produtos.get(i);
            System.out.println(produto);
        }

        // Usando for-each
        System.out.println("\nForEach percorrendo por elementos: ");
        for (Produtos produto : produtos) {
            System.out.println(produto);
        }

        // Usando método forEach com Lambda
        System.out.println("\nUsando método forEach com Lambda: ");
        produtos.forEach(produto -> System.out.println(produto));
    }
}