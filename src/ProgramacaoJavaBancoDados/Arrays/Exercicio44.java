package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 44 — Buscar valor na matriz.
public class Exercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Linha " + i + ", coluna " + j + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Valor a pesquisar: ");
        int procurado = scanner.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == procurado) {
                    System.out.println("Encontrado na linha " + i + ", coluna " + j);
                    encontrado = true;
                }
            }
        }
        if (!encontrado) System.out.println("Valor não encontrado");
        scanner.close();
    }
}
