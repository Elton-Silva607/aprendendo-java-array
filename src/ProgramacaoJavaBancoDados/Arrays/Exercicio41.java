package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 41 — Diagonal secundária.
public class Exercicio41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Linha " + i + ", coluna " + j + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) System.out.println(matriz[i][matriz.length - 1 - i]);
        scanner.close();
    }
}
