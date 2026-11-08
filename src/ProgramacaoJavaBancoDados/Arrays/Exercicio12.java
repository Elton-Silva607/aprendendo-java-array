package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 12 — Buscar número e posição.
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        System.out.print("Número para pesquisar: ");
        int procurado = scanner.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == procurado) {
                System.out.println("Encontrado na posição (índice) " + i);
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("Número não encontrado");
        scanner.close();
    }
}
