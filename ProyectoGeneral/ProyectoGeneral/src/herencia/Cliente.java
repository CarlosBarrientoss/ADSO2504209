package herencia;

import java.util.Date;

public class Cliente extends Persona {

    private static int contadorCliente = 0;
    private int idCliente;
    private Date fechaRegistro;
    private boolean isVip;

    public Cliente(String nombre, char genero, String direccion, Date fechaRegistro, boolean isVip) {
        super(nombre, genero, direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.isVip = isVip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean isVip) {
        this.isVip = isVip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", isVip=").append(isVip);
        sb.append(", persona=").append(super.toString());
        sb.append("}");
        return sb.toString();
    }
}
