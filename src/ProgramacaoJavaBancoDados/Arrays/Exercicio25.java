package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 25 — Somar apenas os ímpares.
public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        int soma = 0;
        for (int numero : numeros) if (numero % 2 != 0) soma += numero;
        System.out.println("Soma dos ímpares: " + soma);
        scanner.close();
    }
}
