package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 37 — Média de cada aluno.
public class Exercicio37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] notas = new double[4][3];
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Linha " + i + ", coluna " + j + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }
        for (int aluno = 0; aluno < notas.length; aluno++) {
            double soma = 0;
            for (double nota : notas[aluno]) soma += nota;
            System.out.println("Média do aluno " + (aluno + 1) + ": " + soma / notas[aluno].length);
        }
        scanner.close();
    }
}
