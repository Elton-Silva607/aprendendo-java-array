package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 35 — Soma de cada linha.
public class Exercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Linha " + i + ", coluna " + j + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            int somaLinha = 0;
            for (int valor : matriz[i]) somaLinha += valor;
            System.out.println("Linha " + i + ": " + somaLinha);
        }
        scanner.close();
    }
}
