package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 21 — Somar dois arrays.
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] primeiro = new int[5], segundo = new int[5], soma = new int[5];
        for (int i = 0; i < primeiro.length; i++) {
            System.out.print("Primeiro array, posição " + i + ": ");
            primeiro[i] = scanner.nextInt();
        }
        for (int i = 0; i < segundo.length; i++) {
            System.out.print("Segundo array, posição " + i + ": ");
            segundo[i] = scanner.nextInt();
        }
        for (int i = 0; i < soma.length; i++) {
            soma[i] = primeiro[i] + segundo[i];
            System.out.println("Soma na posição " + i + ": " + soma[i]);
        }
        scanner.close();
    }
}
