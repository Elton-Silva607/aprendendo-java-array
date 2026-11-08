package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 42 — Contar pares na matriz.
public class Exercicio42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Linha " + i + ", coluna " + j + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        int pares = 0;
        for (int[] linha : matriz) for (int valor : linha) if (valor % 2 == 0) pares++;
        System.out.println("Quantidade de pares: " + pares);
        scanner.close();
    }
}
