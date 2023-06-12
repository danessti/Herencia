package Calculo;

public class Main {

    public static void main(String[] args) {

        Cuadrado cuadro = new Cuadrado(2, 2);
        Triangulo trian = new Triangulo(3, 4);
        Circulo circu = new Circulo(4);

        System.out.println("El area del cuadrado es " + cuadro.calcularArea());
        System.out.println("El perimetro del cuadrado es " + cuadro.calcularPerimetro() + "\n");

        System.out.println("El area del triangulo es " + trian.calcularArea());
        System.out.println("El perimetro del triangulo es " + trian.calcularPerimetro() + "\n");

        System.out.println("El area del circulo es " + circu.calcularArea());
        System.out.println("El perimetro del circulo es " + circu.calcularPerimetro() + "\n");

    }

}
