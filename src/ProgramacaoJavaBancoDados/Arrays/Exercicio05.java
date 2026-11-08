package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 5 — Maior número.
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        int maior = numeros[0];
        for (int numero : numeros) if (numero > maior) maior = numero;
        System.out.println("Maior: " + maior);
        scanner.close();
    }
}
