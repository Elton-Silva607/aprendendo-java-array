package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 26 — Mostrar nomes com mais de 5 letras.
public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[6];
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        for (String nome : nomes) if (nome.length() > 5) System.out.println(nome);
        scanner.close();
    }
}
