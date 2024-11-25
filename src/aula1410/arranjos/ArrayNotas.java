package aula1410.arranjos;

public class ArrayNotas {
    public static void main(String[] args) {
        // Declaração do array com 4 posições
        int[] notas = new int[4];

        // Atribuição dos valores
        notas[0] = 10; // 1ª nota
        notas[1] = 8;  // 2ª nota
        notas[2] = 9;  // 3ª nota
        notas[3] = 7;  // 4ª nota

        // Acesso aos elementos
        System.out.println("1ª nota: " + notas[0]);
        System.out.println("3ª nota: " + notas[2]);

        System.out.println("------");

        // Lista todas as notas
        System.out.println("Relação das notas:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Nota " + (i+1) + ": " + notas[i]);
        }

        System.out.println("----------");

        // Declaração e inicialização do array
        int[] valores = {39, 23, 35, 44, 42};

        // for aprimorado (for-each)
        System.out.println("Exemplo de <for> aprimorado");
        for (int valor: valores) {
            System.out.println(valor);
        }

        int tamanho = valores.length; // Retorna o tamanho do array
        System.out.println("Tamanho do array: " + tamanho);
    }
}
