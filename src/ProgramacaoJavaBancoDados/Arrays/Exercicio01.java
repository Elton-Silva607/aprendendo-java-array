package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 1 — Guardando nomes.
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        for (String nome : nomes) System.out.println(nome);
        scanner.close();
    }
}
