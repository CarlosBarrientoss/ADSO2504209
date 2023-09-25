package Interfaces.accesodatos;

public class ImplementacionOracle implements IAccesoDatos{
    public ImplementacionOracle() {
    }

    public void insertar() {
        System.out.println("Insertando datos desde Oracle");
    }

    public void listar() {
        System.out.println("Listando datos desde Oracle");
    }

    public void actualizar() {
        System.out.println("Actualizando datos desde Oracle");
    }

    public void eliminar() {
        System.out.println("Eliminando datos desde Oracle");
    }
}
