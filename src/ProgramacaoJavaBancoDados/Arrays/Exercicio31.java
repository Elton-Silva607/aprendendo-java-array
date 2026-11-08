package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 31 — Criar matriz 2 por 3.
public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Linha " + i + ", coluna " + j + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (int[] linha : matriz) {
            for (int valor : linha) System.out.print(valor + " ");
            System.out.println();
        }
        scanner.close();
    }
}
