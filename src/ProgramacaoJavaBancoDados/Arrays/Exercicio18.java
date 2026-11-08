package ProgramacaoJavaBancoDados.Arrays;

import java.util.Scanner;

// Exercício 18 — Maior e menor nota.
public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[6];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        double maior = notas[0], menor = notas[0], soma = 0;
        for (double nota : notas) {
            if (nota > maior) maior = nota;
            if (nota < menor) menor = nota;
            soma += nota;
        }
        System.out.println("Maior: " + maior + " | Menor: " + menor + " | Média: " + soma / notas.length);
        scanner.close();
    }
}
