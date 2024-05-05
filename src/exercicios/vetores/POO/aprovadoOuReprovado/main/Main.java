package exercicios.vetores.POO.aprovadoOuReprovado.main;

import exercicios.vetores.POO.aprovadoOuReprovado.entities.Students;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();

        Students[] students = new Students[n];
        for (int i = 0; i < students.length; i++) {
            sc.nextLine();
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno: ");
            String nome = sc.nextLine();
            double notaPrimeiroSemestre = sc.nextDouble();
            double notaSegundoSemestre = sc.nextDouble();
            students[i] = new Students(nome, notaPrimeiroSemestre, notaSegundoSemestre);
        }

        double soma = 0.0;
        double media = 0.0;
        double[] mediaAlunos = new double[n];
        for (int i = 0; i < n; i++) {
            mediaAlunos[i] = students[i].getNotaPrimeiroSemestre() + students[i].getNotaSegundoSemestre();
            mediaAlunos[i] = mediaAlunos[i] / 2;
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < n; i++) {
            if (mediaAlunos[i] >= 6.0) {
                System.out.println(students[i].getNome());
            }
        }

        sc.close();
    }
}
