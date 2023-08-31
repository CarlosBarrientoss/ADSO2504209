package Interfaces.accesodatos;

public class ImplementacionMySql implements IAccesoDatos{
    public ImplementacionMySql() {
    }

    public void insertar() {
        System.out.println("Insertando datos desde MySql");
    }

    public void listar() {
        System.out.println("Listando datos desde MySql");
    }

    public void actualizar() {
        System.out.println("Actualizando datos desde MySql");
    }

    public void eliminar() {
        System.out.println("Eliminando datos desde MySql");
    }
}
