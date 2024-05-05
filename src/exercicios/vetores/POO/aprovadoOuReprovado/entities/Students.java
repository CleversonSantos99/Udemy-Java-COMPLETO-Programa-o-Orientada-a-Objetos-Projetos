package exercicios.vetores.POO.aprovadoOuReprovado.entities;

public class Students {

    private String nome;
    private double NotaPrimeiroSemestre;
    private double NotaSegundoSemestre;

    public Students(String nome, double notaPrimeiroSemestre, double notaSegundoSemestre) {
        this.nome = nome;
        this.NotaPrimeiroSemestre = notaPrimeiroSemestre;
        this.NotaSegundoSemestre = notaSegundoSemestre;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaPrimeiroSemestre() {
        return NotaPrimeiroSemestre;
    }

    public void setNotaPrimeiroSemestre(double notaPrimeiroSemestre) {
        NotaPrimeiroSemestre = notaPrimeiroSemestre;
    }

    public double getNotaSegundoSemestre() {
        return NotaSegundoSemestre;
    }

    public void setNotaSegundoSemestre(double notaSegundoSemestre) {
        NotaSegundoSemestre = notaSegundoSemestre;
    }
}
