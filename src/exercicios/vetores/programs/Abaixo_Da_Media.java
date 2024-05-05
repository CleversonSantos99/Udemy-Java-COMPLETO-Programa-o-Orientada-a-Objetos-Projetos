package exercicios.vetores.programs;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Locale;
import java.util.Scanner;

public class Abaixo_Da_Media {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        double soma = 0.0;
        double average = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }
        average = soma / vetor.length;

        System.out.println();
        System.out.printf("MEDIA DO VETOR = %.3f%n", average);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < average) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}
