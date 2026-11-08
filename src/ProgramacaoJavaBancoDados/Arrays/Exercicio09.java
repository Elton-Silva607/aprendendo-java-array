package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 9 — Positivos, negativos e zeros.
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        int positivos = 0, negativos = 0, zeros = 0;
        for (int numero : numeros) {
            if (numero > 0) positivos++;
            else if (numero < 0) negativos++;
            else zeros++;
        }
        System.out.println("Positivos: " + positivos + " | Negativos: " + negativos + " | Zeros: " + zeros);
        scanner.close();
    }
}
