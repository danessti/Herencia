package Profesion;

public class Main {

    public static void main(String[] args) {

        Arquitecto juan = new Arquitecto();

        juan.setBono(2000000L);

        juan.imprimirSueldo();

        Ingeniero ingeniero = new Ingeniero(5000000L);

        ingeniero.imprimirSueldo();

        Medico medico = new Medico();

        medico.setBono(3000000L);

        medico.imprimirSueldo();

    }

}