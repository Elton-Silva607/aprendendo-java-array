package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 22 — Comparar dois arrays.
public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] primeiro = new int[5], segundo = new int[5];
        for (int i = 0; i < primeiro.length; i++) {
            System.out.print("Primeiro array, posição " + i + ": ");
            primeiro[i] = scanner.nextInt();
        }
        for (int i = 0; i < segundo.length; i++) {
            System.out.print("Segundo array, posição " + i + ": ");
            segundo[i] = scanner.nextInt();
        }
        boolean iguais = true;
        for (int i = 0; i < primeiro.length; i++) if (primeiro[i] != segundo[i]) iguais = false;
        System.out.println(iguais ? "Arrays iguais" : "Arrays diferentes");
        scanner.close();
    }
}
