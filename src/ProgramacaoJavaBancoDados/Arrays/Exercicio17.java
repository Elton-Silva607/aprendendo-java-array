package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 17 — Aprovados e reprovados.
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        int aprovados = 0, reprovados = 0;
        for (double nota : notas) {
            if (nota >= 7) aprovados++;
            else reprovados++;
        }
        System.out.println("Aprovados: " + aprovados + " | Reprovados: " + reprovados);
        scanner.close();
    }
}
