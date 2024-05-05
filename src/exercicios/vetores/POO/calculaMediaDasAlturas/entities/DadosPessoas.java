package exercicios.vetores.POO.calculaMediaDasAlturas.entities;

public class DadosPessoas {

    private double altura;
    private char genero;

    public DadosPessoas(double altura, char genero) {
        this.altura = altura;
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
}
