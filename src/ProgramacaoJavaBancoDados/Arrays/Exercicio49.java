package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 49 — Vendas por vendedor.
public class Exercicio49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] vendas = new double[3][4];
        for (int i = 0; i < vendas.length; i++) {
            for (int j = 0; j < vendas[i].length; j++) {
                System.out.print("Linha " + i + ", coluna " + j + ": ");
                vendas[i][j] = scanner.nextDouble();
            }
        }
        double maiorTotal = Double.NEGATIVE_INFINITY;
        int melhorVendedor = 0;
        for (int i = 0; i < vendas.length; i++) {
            double total = 0;
            for (double venda : vendas[i]) total += venda;
            System.out.println("Total do vendedor " + (i + 1) + ": " + total);
            if (total > maiorTotal) { maiorTotal = total; melhorVendedor = i; }
        }
        System.out.println("Vendedor com maior total: " + (melhorVendedor + 1));
        System.out.println("Em caso de empate, é mostrado o primeiro.");
        scanner.close();
    }
}
