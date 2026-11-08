package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 13 — Contar repetição de um número.
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        System.out.print("Número para pesquisar: ");
        int procurado = scanner.nextInt();
        int contador = 0;
        for (int numero : numeros) if (numero == procurado) contador++;
        System.out.println("Quantidade de ocorrências: " + contador);
        scanner.close();
    }
}
