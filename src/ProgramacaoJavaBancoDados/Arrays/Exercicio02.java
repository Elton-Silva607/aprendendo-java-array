package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 2 — Guardando idades.
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idades = new int[6];
        for (int i = 0; i < idades.length; i++) {
            System.out.print("Idade " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
        }
        for (int idade : idades) System.out.println(idade);
        scanner.close();
    }
}
