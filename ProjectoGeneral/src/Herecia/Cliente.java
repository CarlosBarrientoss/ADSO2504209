package Herecia;

import java.time.LocalDate;
import java.util.Date;

public class Cliente extends Persona{
    private int idCliente;
    private LocalDate fechaRegistro;
    private boolean vip;
    private static int contadorCliente;

    public Cliente(int idCliente, LocalDate fechaRegistro, boolean vip, String nombre){
        super(nombre);
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
        this.idCliente = ++Cliente.contadorCliente;
    }

    public int getIdCliente(){
        return idCliente;
    }
    public LocalDate getFechaRegistro(){
        return fechaRegistro;
    }
    public void setFechaRegistro(LocalDate fechaRegistro){
        this.fechaRegistro = fechaRegistro;
    }
    public boolean getVip(){
        return vip=vip;
    }
    public void setVip(boolean vip){
        this.vip = vip;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", Persona=").append(super.toString());
        sb.append(", vip=").append(vip);
        sb.append('}');
        return sb.toString();
    }
}
