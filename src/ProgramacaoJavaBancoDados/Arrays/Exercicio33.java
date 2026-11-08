package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 33 — Maior valor da matriz.
public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Linha " + i + ", coluna " + j + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        int maior = matriz[0][0];
        for (int[] linha : matriz) for (int valor : linha) if (valor > maior) maior = valor;
        System.out.println("Maior: " + maior);
        scanner.close();
    }
}
