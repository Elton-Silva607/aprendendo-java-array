package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 47 — Multiplicar matriz por um número.
public class Exercicio47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Linha " + i + ", coluna " + j + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Multiplicador: ");
        int multiplicador = scanner.nextInt();
        for (int[] linha : matriz) {
            for (int valor : linha) System.out.print((valor * multiplicador) + " ");
            System.out.println();
        }
        scanner.close();
    }
}
