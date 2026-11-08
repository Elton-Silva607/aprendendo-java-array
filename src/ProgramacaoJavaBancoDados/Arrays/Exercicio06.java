package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 6 — Menor número.
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        int menor = numeros[0];
        for (int numero : numeros) if (numero < menor) menor = numero;
        System.out.println("Menor: " + menor);
        scanner.close();
    }
}
