package TarjetaCredito;

public class Platinum extends TarjetaCredito {

    private String tipoTarjeta;

    public Platinum(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getTipoTarjeta() {
        return "Tipo de tarjeta: " + tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

}