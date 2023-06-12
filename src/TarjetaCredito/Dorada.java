package TarjetaCredito;

public class Dorada extends TarjetaCredito {

    private String tipoTarjeta;

    public Dorada(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getTipoTarjeta() {
        return "Tipo de tarjeta: " + tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

}