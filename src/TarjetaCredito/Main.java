package TarjetaCredito;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Clasica clasica = new Clasica("Clasica");
        Dorada dorada = new Dorada("Dorada");
        Platinum platinum = new Platinum("Platinum");
        Black black = new Black("Black");

        TarjetaCredito tarjeta1 = new TarjetaCredito("Visa", 2000000L, "A2123S31", 2411, LocalDate.of(2025, 6, 11));
        TarjetaCredito tarjeta2 = new TarjetaCredito("Mastercard", 4000000L, "34512678", 2412, LocalDate.of(2025, 7, 11));
        TarjetaCredito tarjeta3 = new TarjetaCredito("American Express", 8000000L, "987651234", 234, LocalDate.of(2025, 9, 11));
        TarjetaCredito tarjeta4 = new TarjetaCredito("Mastercard", 3000000L, "123987456", 241, LocalDate.of(2025, 8, 11));

        System.out.println(clasica.getTipoTarjeta() + tarjeta1.imprimirInfo() + "\n--------------------------------");
        System.out.println(dorada.getTipoTarjeta() + tarjeta2.imprimirInfo() + "\n--------------------------------");
        System.out.println(platinum.getTipoTarjeta() + tarjeta3.imprimirInfo() + "\n--------------------------------");
        System.out.println(black.getTipoTarjeta() + tarjeta4.imprimirInfo() + "\n--------------------------------");

    }

}