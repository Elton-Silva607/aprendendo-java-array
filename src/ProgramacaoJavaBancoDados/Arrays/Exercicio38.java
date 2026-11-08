package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 38 — Boletim com nomes.
public class Exercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[4];
        double[][] notas = new double[4][3];
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Nota " + (j + 1) + " de " + nomes[i] + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }
        for (int i = 0; i < nomes.length; i++) {
            double soma = 0;
            System.out.print(nomes[i] + " — notas: ");
            for (double nota : notas[i]) { System.out.print(nota + " "); soma += nota; }
            double media = soma / notas[i].length;
            // Adotado o limite 7 do exercício 17; o enunciado não o repete.
            System.out.println("| Média: " + media + " | " + (media >= 7 ? "Aprovado" : "Reprovado"));
        }
        scanner.close();
    }
}
