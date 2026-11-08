package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 27 — Contar nomes que começam com A.
public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[6];
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        int quantidade = 0;
        for (String nome : nomes) {
            if (!nome.isEmpty() && (nome.charAt(0) == 'A' || nome.charAt(0) == 'a')) quantidade++;
        }
        System.out.println("Nomes iniciados com A: " + quantidade);
        scanner.close();
    }
}
