package accesodatos;

public class ImplementacionPostgreSql implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertando desde PostgreSql ");
    }

    @Override
    public void listar() {
        System.out.println("Listando desde PostgreSql ");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando desde PostgreSql ");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminado desde PostgreSql ");

    }

}
