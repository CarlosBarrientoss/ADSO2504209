package herencia;

import java.util.Date;

public class Cliente extends Persona {
    
    private static int contadorId = 0;
    private int idCliente;
    private Date fechaRegistro;
    private boolean isVip;

    public Cliente(String nombre, char genero, String direccion, Date fechaRegistro, boolean isvip) {
        super(nombre, genero , direccion);
        this.idCliente = ++Cliente.contadorId;
        this.fechaRegistro = fechaRegistro;
        this.isVip = isvip;
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

    public void setVip(boolean isvip) {
        this.isVip = isvip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", isVip=").append(isVip);
        sb.append(", Persona=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
