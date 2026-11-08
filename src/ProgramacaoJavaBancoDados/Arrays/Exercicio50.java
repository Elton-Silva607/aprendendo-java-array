package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 50 — Estoque por loja.
public class Exercicio50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] estoque = new int[3][5];
        for (int i = 0; i < estoque.length; i++) {
            for (int j = 0; j < estoque[i].length; j++) {
                System.out.print("Linha " + i + ", coluna " + j + ": ");
                estoque[i][j] = scanner.nextInt();
            }
        }
        int maiorTotal = Integer.MIN_VALUE;
        int melhorLoja = 0;
        for (int loja = 0; loja < estoque.length; loja++) {
            int total = 0;
            for (int quantidade : estoque[loja]) total += quantidade;
            System.out.println("Total da loja " + (loja + 1) + ": " + total);
            if (total > maiorTotal) { maiorTotal = total; melhorLoja = loja; }
        }
        for (int produto = 0; produto < estoque[0].length; produto++) {
            int total = 0;
            for (int loja = 0; loja < estoque.length; loja++) total += estoque[loja][produto];
            System.out.println("Total do produto " + (produto + 1) + ": " + total);
        }
        System.out.println("Loja com mais produtos: " + (melhorLoja + 1));
        System.out.println("Em caso de empate, é mostrada a primeira.");
        scanner.close();
    }
}
