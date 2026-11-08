package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 23 — Multiplicar todos os valores.
public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        System.out.print("Multiplicador: ");
        int multiplicador = scanner.nextInt();
        for (int numero : numeros) System.out.println(numero * multiplicador);
        scanner.close();
    }
}
