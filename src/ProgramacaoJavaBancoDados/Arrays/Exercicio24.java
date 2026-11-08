package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 24 — Somar apenas os pares.
public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        int soma = 0;
        for (int numero : numeros) if (numero % 2 == 0) soma += numero;
        System.out.println("Soma dos pares: " + soma);
        scanner.close();
    }
}
