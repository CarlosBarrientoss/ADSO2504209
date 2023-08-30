package accesodatos;


public class ImplementacionPostgreSql implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertando desde PostgreSQL");
    }

    @Override
    public void listar() {
        System.out.println("Listando desde PostgreSQL");

    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando desde PostgreSQL");

    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando desde PostgreSQL");

    }
    
}
