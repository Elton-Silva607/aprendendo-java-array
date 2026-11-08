package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 48 — Matriz transposta.
public class Exercicio48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Linha " + i + ", coluna " + j + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        int[][] transposta = new int[3][2];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) transposta[j][i] = matriz[i][j];
        }
        for (int[] linha : transposta) {
            for (int valor : linha) System.out.print(valor + " ");
            System.out.println();
        }
        scanner.close();
    }
}
