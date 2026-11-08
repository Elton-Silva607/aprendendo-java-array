package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 7 — Contar pares.
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        int quantidade = 0;
        for (int numero : numeros) if (numero % 2 == 0) quantidade++;
        System.out.println("Pares: " + quantidade);
        scanner.close();
    }
}
