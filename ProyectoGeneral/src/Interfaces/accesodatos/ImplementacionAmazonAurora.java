package Interfaces.accesodatos;

public class ImplementacionAmazonAurora implements IAccesoDatos{
    public ImplementacionAmazonAurora() {
    }

    public void insertar() {
        System.out.println("Insertando datos desde Amazon Aurora");
    }

    public void listar() {
        System.out.println("Listando datos desde Amazon Aurora");
    }

    public void actualizar() {
        System.out.println("Actualizando datos desde Amazon Aurora");
    }

    public void eliminar() {
        System.out.println("Eliminando datos desde Amazon Aurora");
    }
}
