package exercicios.vetores.programs;

import java.util.Locale;
import java.util.Scanner;

public class Numeros_Pares {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");

        int n = sc.nextInt();
        int[] vetor = new int[n];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println();

        System.out.println("NUMEROS PARES: ");
        int counter = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i]);
                counter = counter + 1;
            }
        }

        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + counter);

        sc.close();
    }
}
