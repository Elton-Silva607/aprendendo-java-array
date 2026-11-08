package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 20 — Verificar número repetido.
public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        boolean repetido = false;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) repetido = true;
            }
        }
        System.out.println(repetido ? "Existe número repetido" : "Não há número repetido");
        scanner.close();
    }
}
