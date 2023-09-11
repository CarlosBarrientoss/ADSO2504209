package Interfaces.accesodatos;

public class ImplementacionPostgreSql implements IAccesoDatos{
    public ImplementacionPostgreSql() {
    }

    public void insertar() {
        System.out.println("Insertando datos desde PostgreSql");
    }

    public void listar() {
        System.out.println("Listando datos desde PostgreSql");
    }

    public void actualizar() {
        System.out.println("Actualizando datos desde PostgreSql");
    }

    public void eliminar() {
        System.out.println("Eliminando datos desde PostgreSql");
    }
}
