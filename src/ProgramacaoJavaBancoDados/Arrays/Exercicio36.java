package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 36 — Soma de cada coluna.
public class Exercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Linha " + i + ", coluna " + j + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (int coluna = 0; coluna < matriz[0].length; coluna++) {
            int somaColuna = 0;
            for (int linha = 0; linha < matriz.length; linha++) somaColuna += matriz[linha][coluna];
            System.out.println("Coluna " + coluna + ": " + somaColuna);
        }
        scanner.close();
    }
}
