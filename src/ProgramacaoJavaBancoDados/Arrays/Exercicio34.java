package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 34 — Menor valor da matriz.
public class Exercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Linha " + i + ", coluna " + j + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        int menor = matriz[0][0];
        for (int[] linha : matriz) for (int valor : linha) if (valor < menor) menor = valor;
        System.out.println("Menor: " + menor);
        scanner.close();
    }
}
