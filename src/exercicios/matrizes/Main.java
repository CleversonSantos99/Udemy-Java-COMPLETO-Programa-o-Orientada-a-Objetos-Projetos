package exercicios.matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] mat = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int position = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == position) {
                    int linha = i;
                    int coluna = j;

                    System.out.println("Position " + linha + ", " + coluna + ":");

                    if (linha >= 0 && linha < mat.length && (coluna - 1) >= 0 && (coluna - 1) < mat[linha].length) {
                        System.out.println("Left: " + mat[linha][coluna - 1]);
                    } else {
                        //posicao nao existe
                    }

                    if ((linha - 1) >= 0 && (linha - 1) < mat.length && coluna >= 0 && coluna < mat[linha].length) {
                        System.out.println("Up: " + mat[linha - 1][coluna]);
                    } else {
                        //posicao nao existe
                    }

                    if (linha >= 0 && linha < mat.length && (coluna + 1) >= 0 && (coluna + 1) < mat[linha].length) {
                        System.out.println("Right: " + mat[linha][coluna + 1]);
                    } else {
                        //posicao nao existe
                    }

                    if ((linha + 1) >= 0 && (linha + 1) < mat.length && coluna >= 0 && coluna < mat[linha].length) {
                        System.out.println("Down: " + mat[linha + 1][coluna]);
                    } else {
                        //posicao nao existe
                    }

                }
            }
        }

        sc.close();
    }
}
