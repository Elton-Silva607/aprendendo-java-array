package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 39 — Diagonal principal.
public class Exercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Linha " + i + ", coluna " + j + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) System.out.println(matriz[i][i]);
        scanner.close();
    }
}
