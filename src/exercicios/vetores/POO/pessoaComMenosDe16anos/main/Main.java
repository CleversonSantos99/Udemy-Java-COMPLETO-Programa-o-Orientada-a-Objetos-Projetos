package exercicios.vetores.POO.pessoaComMenosDe16anos.main;

import exercicios.vetores.POO.pessoaComMenosDe16anos.entities.People;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();

        People[] people = new People[n];
        for (int i = 0; i < people.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a Pessoa: ");
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            people[i] = new People(name, age, height);
            sc.nextLine();
        }

        double sum = 0.0;
        for (int i = 0; i < people.length; i++) {
            sum = sum + people[i].getHeight();
        }

        System.out.println();

        double average = sum / people.length;
        System.out.println("Altura média: " + String.format("%.2f", average));

        int counter = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i].getAge() < 16) {
                counter = counter + 1;
            }
        }

        double percentage = counter * 100 / people.length;
        System.out.println("Pessoas com menos de 16 anos: " + percentage + "%");

        for (int i = 0; i < people.length; i++) {
            if (people[i].getAge() < 16) {
                System.out.println(people[i]);
            }
        }

        sc.close();
    }
}
