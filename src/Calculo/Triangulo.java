package Calculo;

public class Triangulo implements FiguraGeometrica{

    private Integer alto;

    private Integer ancho;

    private int lado = 3;

    public Triangulo(Integer alto, Integer ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public Integer calcularArea() {
        return (alto * ancho) / 2;
    }

    @Override
    public Integer calcularPerimetro() {
        return (int) (ancho + alto + Math.sqrt((alto * alto) + (ancho * ancho)));
    }

}