package exercicios.vetores.programs;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Media_Pares {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        int soma = 0;
        double media = 0.0;
        int npares = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                soma = soma + vetor[i];
                npares++;
            }
        }

        if (npares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            media = soma / vetor.length;
            System.out.println("MEDIAD DOS PARES = " + media);
        }

        sc.close();
    }
}
