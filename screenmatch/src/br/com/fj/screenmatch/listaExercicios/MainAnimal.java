package br.com.fj.screenmatch.listaExercicios;

public class MainAnimal {
    public static void main(String[] args) {
        // Criando objeto da classe Cachorro
        Cachorro cachorro = new Cachorro("Bolt", "Pastor Alemão", 5, "Preto e Marrom", "30kg");

        // Casting para a classe base Animal
        Animal animal = cachorro;

        // Usando instanceof para verificar o tipo antes do casting
        if (animal instanceof Cachorro) {
            Cachorro cachorroCast = (Cachorro) animal;
            System.out.println("O objeto é realmente um Cachorro.");
            System.out.println(cachorroCast.emitirSom());
            System.out.println(cachorroCast);
        } else {
            System.out.println("O objeto não é um Cachorro.");
        }
    }
}
