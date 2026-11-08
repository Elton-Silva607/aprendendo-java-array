package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 16 — Criar segundo array com dobro.
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        int[] dobros = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) dobros[i] = numeros[i] * 2;
        for (int dobro : dobros) System.out.println(dobro);
        scanner.close();
    }
}
