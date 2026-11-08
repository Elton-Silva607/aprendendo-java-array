package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 28 — Relatório de alunos.
public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];
        double[] notas = new double[5];
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome: ");
            nomes[i] = scanner.nextLine();
            System.out.print("Nota: ");
            notas[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        for (int i = 0; i < nomes.length; i++) {
            // Adotado o limite 7 do exercício 17; o enunciado não o repete.
            String situacao = notas[i] >= 7 ? "Aprovado" : "Reprovado";
            System.out.println(nomes[i] + " | Nota: " + notas[i] + " | " + situacao);
        }
        scanner.close();
    }
}
