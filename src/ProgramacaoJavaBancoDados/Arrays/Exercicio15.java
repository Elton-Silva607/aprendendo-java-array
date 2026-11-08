package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 15 — Dobro dos valores.
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        for (int numero : numeros) System.out.println("Dobro de " + numero + ": " + (numero * 2));
        scanner.close();
    }
}
