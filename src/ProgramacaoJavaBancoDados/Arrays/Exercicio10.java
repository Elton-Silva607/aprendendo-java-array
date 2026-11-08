package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 10 — Notas acima da média.
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        double soma = 0;
        for (double nota : notas) soma += nota;
        double media = soma / notas.length;
        System.out.println("Média: " + media);
        for (double nota : notas) if (nota > media) System.out.println("Acima da média: " + nota);
        scanner.close();
    }
}
