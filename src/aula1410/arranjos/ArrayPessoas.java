package aula1410.arranjos;

import aula1410.Pessoa;

public class ArrayPessoas {
    public static void main(String[] args) {
        // Criação de constante
        final int NUM_PESSOAS = 4;

        // Declaração do array
        Pessoa[] pessoas = new Pessoa[NUM_PESSOAS];

        // Atribuição dos valores
        pessoas[0] = new Pessoa("Fulano", 25);
        pessoas[1] = new Pessoa("Beltrano", 35);
        pessoas[2] = new Pessoa("Sicrano", 45);

        Pessoa ze = new Pessoa("Zé da Silva", 18);
        pessoas[3] = ze;

        System.out.println(pessoas[2].nome + " - " + pessoas[2].idade);

        System.out.println("---------");

        // Listando os objetos com o <for> convencional
        for (int i = 0; i < NUM_PESSOAS; i++) {
            System.out.println(pessoas[i].nome);
        }

        System.out.println("---------");

        // for aprimorado (for-each)
        System.out.println("Exemplo de <for> aprimorado");
        for (Pessoa p: pessoas) {
            System.out.println(p.nome + " - " + p.idade);
        }
    }
}
