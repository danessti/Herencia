package Calculo;

public class Main {

    public static void main(String[] args) {

        Cuadrado cuadro = new Cuadrado(2, 2);
        Triangulo trian = new Triangulo(3, 4);
        Circulo circu = new Circulo(4);

        System.out.println(cuadro.calcularArea());
        System.out.println(cuadro.calcularPerimetro() + "\n");

        System.out.println(trian.calcularArea());
        System.out.println(trian.calcularPerimetro() + "\n");

        System.out.println(circu.calcularArea());
        System.out.println(circu.calcularPerimetro() + "\n");

    }

}