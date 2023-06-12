package Profesion;

public class Profesion {

    private Long sueldo;

    private Long bono;

    public Profesion() {
        sueldo = 2000000L;
    }

    public Profesion(Long sueldo) {
        this.sueldo = sueldo;
        this.bono = 5000000L;
    }

    public Long getBono() {
        return this.bono;
    }

    public void setBono(Long bono) {
        this.bono = bono;
    }

    public Long calcularSueldo() {
        return this.sueldo + this.bono;
    }

    public void imprimirSueldo() {
        System.out.println("El sueldo correspondiente es: " + calcularSueldo());
    }

}