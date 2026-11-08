package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 40 — Soma da diagonal principal.
public class Exercicio40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Linha " + i + ", coluna " + j + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) soma += matriz[i][i];
        System.out.println("Soma da diagonal principal: " + soma);
        scanner.close();
    }
}
