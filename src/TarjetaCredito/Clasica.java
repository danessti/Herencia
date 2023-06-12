package TarjetaCredito;

public class Clasica extends TarjetaCredito {

    private String tipoTarjeta;

    public Clasica(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getTipoTarjeta() {
        return "Tipo de tarjeta: " + tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

}