package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 45 — Trocar linha 0 com linha 2.
public class Exercicio45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Linha " + i + ", coluna " + j + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (int j = 0; j < matriz[0].length; j++) {
            int temporario = matriz[0][j];
            matriz[0][j] = matriz[2][j];
            matriz[2][j] = temporario;
        }
        for (int[] linha : matriz) {
            for (int valor : linha) System.out.print(valor + " ");
            System.out.println();
        }
        scanner.close();
    }
}
