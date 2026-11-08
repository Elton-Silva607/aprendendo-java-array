package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 19 — Trocar primeiro e último valor.
public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        int temporario = numeros[0];
        numeros[0] = numeros[numeros.length - 1];
        numeros[numeros.length - 1] = temporario;
        for (int numero : numeros) System.out.println(numero);
        scanner.close();
    }
}
