package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 3 — Soma de números.
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        int soma = 0;
        for (int numero : numeros) soma += numero;
        System.out.println("Soma: " + soma);
        scanner.close();
    }
}
