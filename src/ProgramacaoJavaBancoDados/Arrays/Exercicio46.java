package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 46 — Trocar coluna 0 com coluna 2.
public class Exercicio46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Linha " + i + ", coluna " + j + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            int temporario = matriz[i][0];
            matriz[i][0] = matriz[i][2];
            matriz[i][2] = temporario;
        }
        for (int[] linha : matriz) {
            for (int valor : linha) System.out.print(valor + " ");
            System.out.println();
        }
        scanner.close();
    }
}
