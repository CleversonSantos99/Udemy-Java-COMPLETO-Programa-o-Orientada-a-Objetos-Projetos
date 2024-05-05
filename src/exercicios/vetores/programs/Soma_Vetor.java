package exercicios.vetores.programs;

import java.util.Locale;
import java.util.Scanner;

public class Soma_Vetor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.println("VALORES: " + vetor[0] + " " + vetor[1] + " " + vetor[2] + " " + vetor[3]);

        double sum = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            sum += vetor[i];
        }

        double average = sum / vetor.length;
        System.out.println("SOMA = " + sum);
        System.out.println("MEDIA = " + average);

        sc.close();
    }
}
