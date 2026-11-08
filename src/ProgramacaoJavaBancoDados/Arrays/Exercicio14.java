package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 14 — Mostrar valores ao contrário.
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        for (int i = numeros.length - 1; i >= 0; i--) System.out.println(numeros[i]);
        scanner.close();
    }
}
