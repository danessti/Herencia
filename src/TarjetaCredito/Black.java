package TarjetaCredito;

public class Black extends TarjetaCredito {

    private String tipoTarjeta;

    public Black(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getTipoTarjeta() {
        return "Tipo de tarjeta: " + tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

}