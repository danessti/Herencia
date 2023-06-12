package Calculo;

public class Cuadrado implements FiguraGeometrica{

    private Integer alto;

    private Integer ancho;

    private int lado = 4;

    public Cuadrado(Integer alto, Integer ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public Integer calcularArea() {
        return ancho * alto;
    }

    @Override
    public Integer calcularPerimetro() {
        return (ancho * 2) + (alto *2);
    }
}