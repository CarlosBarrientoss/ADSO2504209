package accesodatos;

public class ImplementacionPostgreSql implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertando datos desde postgresql");
    }

    @Override
    public void listar() {
        System.out.println("listando datos desde postgresql");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizando datos desde postgresql");
    }

    @Override
    public void eliminar() {
        System.out.println("eliminando datos desde postgresql");
    }

}
