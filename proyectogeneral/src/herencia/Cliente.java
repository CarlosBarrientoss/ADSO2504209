package herencia;

public class Cliente extends  Persona {
    private int idCliente;
    private String fechaRegistro;
    private boolean vip;

        public Cliente(String nombre, char genero, int edad, String direccion, String fechaRegistro, boolean vip
        ) {
        super(nombre, genero,edad,direccion);
        this.fechaRegistro=fechaRegistro;
        this.vip=vip;
        this.idCliente=++contadorCliente;
        }
    
    private static int contadorCliente;
    
    
    public int getIdCliente() {
        return idCliente;
    }
    
    public String getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public boolean isVip() {
        return vip;
    }
    public void setVip(boolean vip) {
        this.vip = vip;
    }
        @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(" "+", vip=").append(vip);
        sb.append(" "+ "fechade registro").append(fechaRegistro);
                sb.append(" "+ ", Persona=").append(super.toString());
        sb.append('}');
        return sb.toString();
}
}
