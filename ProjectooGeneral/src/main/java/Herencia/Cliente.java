
package Herencia;

import java.util.Date;

public class Cliente extends Persona{
    
    private int idCliente;
    private Date fechaRegistro;
    private String vip;
    private static int contadorCliente;

    public Cliente(String nombre, char genero, String direccion, Date fechaRegistro, String vip) {
        super(nombre, genero, direccion);
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
        this.idCliente = ++Cliente.contadorCliente;
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

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public static int getContadorCliente() {
        return contadorCliente;
    }

    public static void setContadorCliente(int contadorCliente) {
        Cliente.contadorCliente = contadorCliente;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", Persona=").append(super.toString());
        sb.append('}');
        return sb.toString();
}

 
    }



