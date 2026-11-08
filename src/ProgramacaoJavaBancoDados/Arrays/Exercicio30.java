package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 30 — Sistema simples de estoque.
public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] produtos = new String[5];
        int[] quantidades = new int[5];
        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Nome do produto: ");
            produtos[i] = scanner.nextLine();
            System.out.print("Quantidade: ");
            quantidades[i] = scanner.nextInt();
            scanner.nextLine();
        }
        for (int i = 0; i < produtos.length; i++) {
            if (quantidades[i] < 5) System.out.println(produtos[i] + ": " + quantidades[i]);
        }
        scanner.close();
    }
}
