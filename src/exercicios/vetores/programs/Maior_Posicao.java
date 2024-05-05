package exercicios.vetores.programs;

import java.util.Locale;
import java.util.Scanner;

public class Maior_Posicao {

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

        double maior = vetor[0];
        int posmaior = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posmaior = i;
            }
        }

        System.out.println();
        System.out.println("MAIOR VALOR = " + maior);
        System.out.println("POSICAO DO MAIOR VALOR = " + posmaior);

        sc.close();
    }
}
