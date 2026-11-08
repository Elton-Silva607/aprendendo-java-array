package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 43 — Contar positivos, negativos e zeros.
public class Exercicio43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Linha " + i + ", coluna " + j + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        int positivos = 0, negativos = 0, zeros = 0;
        for (int[] linha : matriz) {
            for (int valor : linha) {
                if (valor > 0) positivos++;
                else if (valor < 0) negativos++;
                else zeros++;
            }
        }
        System.out.println("Positivos: " + positivos + " | Negativos: " + negativos + " | Zeros: " + zeros);
        scanner.close();
    }
}
