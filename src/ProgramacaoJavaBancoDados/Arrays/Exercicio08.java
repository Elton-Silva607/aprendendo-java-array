package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 8 — Contar ímpares.
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        int quantidade = 0;
        for (int numero : numeros) if (numero % 2 != 0) quantidade++;
        System.out.println("Ímpares: " + quantidade);
        scanner.close();
    }
}
