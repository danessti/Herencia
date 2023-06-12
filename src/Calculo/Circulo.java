package Calculo;

public class Circulo implements FiguraGeometrica {

    public Integer radio;

    public Circulo(Integer radio) { this.radio = radio; }

    @Override
    public Integer calcularArea() {
        return (int) ((radio * radio) * Math.PI);
    }

    @Override
    public Integer calcularPerimetro() {
        return (int) (2 * Math.PI * radio);
    }

}