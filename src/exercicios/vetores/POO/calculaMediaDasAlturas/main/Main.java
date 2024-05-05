package exercicios.vetores.POO.calculaMediaDasAlturas.main;

import exercicios.vetores.POO.calculaMediaDasAlturas.entities.DadosPessoas;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        DadosPessoas[] pessoas = new DadosPessoas[n];
        for (int i = 0; i < pessoas.length; i++) {
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            double altura = sc.nextDouble();
            System.out.print("Genero da " + (i + 1) + "a pessoa: ");
            char genero = sc.next().charAt(0);
            pessoas[i] = new DadosPessoas(altura, genero);
        }

        double maiorAltura = pessoas[0].getAltura();
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getAltura() > maiorAltura) {
                maiorAltura = pessoas[i].getAltura();
            }
        }

        double menorAltura = pessoas[0].getAltura();
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getAltura() < menorAltura) {
                menorAltura = pessoas[i].getAltura();
            }
        }

        double soma = 0.0;
        double media = 0.0;
        int mulheres = 0;
        for (int i = 0; i < n; i++) {
            if (pessoas[i].getGenero() == 'F') {
                soma = soma + pessoas[i].getAltura();
                mulheres++;
            }
        }

        media = soma / mulheres;

        int contador = 0;
        for (int i = 0; i < n; i++) {
            if (pessoas[i].getGenero() == 'M') {
                contador++;
            }
        }

        System.out.println("Menor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorAltura);
        System.out.println("Media das alturas das mulheres = " + media);
        System.out.println("Numero de homens = " + contador);

        sc.close();
    }
}
