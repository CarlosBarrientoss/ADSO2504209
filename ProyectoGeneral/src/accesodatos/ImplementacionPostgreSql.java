package accesodatos;

public class ImplementacionPostgreSql implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertando datos desde PostgreSql");
    }

    @Override
    public void listar() {
        System.out.println("Listando datos desde PostgreSql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando datos desde PostgreSql");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando datos desde PostgreSql");
    }
    
}
