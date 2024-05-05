package exercicios.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public class Exercicio {

        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner scanner = new Scanner(System.in);

            List<Employee> list = new ArrayList<>();

            System.out.print("How many employees will be registered: ");
            int N = scanner.nextInt();

            for (int i = 0; i < N; i++) {
                System.out.println();
                System.out.println("Employee #" + (i + 1) + ":");
                System.out.print("Id: ");
                int id = scanner.nextInt();
                System.out.print("Name: ");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.print("Salary: ");
                double salary = scanner.nextDouble();
                Employee employee = new Employee(id, name, salary);
                list.add(employee);
            }

            System.out.println();
            System.out.print("Enter the employee id that will have salary increase : ");
            int idSalary = scanner.nextInt();

            Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

            // Integer pos = position(list, idSalary);

            if (emp == null) {
                System.out.println("This id does not exist!");
            } else {
                System.out.print("Enter the percentage: ");
                double percentage = scanner.nextDouble();
                emp.increaseSalary(percentage);
                // list.get(emp).increaseSalary(percentage);
            }

            System.out.println();
            System.out.println("List of employees: ");
            for (Employee x : list) {
                System.out.println(x);
            }

            scanner.close();
        }

        public static Integer position(List<Employee> list, int id) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId() == id) {
                    return i;
                }
            }
            return null;
        }
    }
}
