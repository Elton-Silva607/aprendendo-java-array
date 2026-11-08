package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 11 — Buscar nome.
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        System.out.print("Nome para pesquisar: ");
        String pesquisado = scanner.nextLine();
        boolean encontrado = false;
        for (String nome : nomes) if (pesquisado.equals(nome)) encontrado = true;
        System.out.println(encontrado ? "Nome encontrado" : "Nome não encontrado");
        scanner.close();
    }
}
