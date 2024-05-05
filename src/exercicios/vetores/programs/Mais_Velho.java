package exercicios.vetores.programs;

import java.util.Locale;
import java.util.Scanner;

public class Mais_Velho {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a Pessoa");
            System.out.print("Nome : ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        int maisVelho = idades[0];
        int posicaomaior = 0;
        String resultado = null;
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > maisVelho) {
                maisVelho = idades[i];
                posicaomaior = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nomes[posicaomaior]);

        sc.close();
    }
}
