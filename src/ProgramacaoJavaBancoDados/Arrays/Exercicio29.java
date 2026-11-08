package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 29 — Menu de busca.
public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] produtos = new String[5];
        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Produto " + (i + 1) + ": ");
            produtos[i] = scanner.nextLine();
        }
        System.out.println("1 - Listar produtos");
        System.out.println("2 - Buscar produto");
        System.out.println("3 - Quantidade cadastrada");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        switch (opcao) {
            case 1:
                for (String produto : produtos) System.out.println(produto);
                break;
            case 2:
                System.out.print("Produto procurado: ");
                String busca = scanner.nextLine();
                boolean encontrado = false;
                for (String produto : produtos) if (produto.equals(busca)) encontrado = true;
                System.out.println(encontrado ? "Produto encontrado" : "Produto não encontrado");
                break;
            case 3: System.out.println("Quantidade: " + produtos.length); break;
            default: System.out.println("Opção inválida.");
        }
        scanner.close();
    }
}
