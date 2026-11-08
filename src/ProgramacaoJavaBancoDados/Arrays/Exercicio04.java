package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 4 — Média de notas.
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        double soma = 0;
        for (double nota : notas) soma += nota;
        System.out.println("Média: " + soma / notas.length);
        scanner.close();
    }
}
