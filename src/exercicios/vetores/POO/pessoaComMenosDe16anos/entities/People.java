package exercicios.vetores.POO.pessoaComMenosDe16anos.entities;

public class People {

    private String name;
    private int age;
    private double height;

    public People(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight() {
        this.height = height;
    }

    public String toString() {
        return name;
    }
}