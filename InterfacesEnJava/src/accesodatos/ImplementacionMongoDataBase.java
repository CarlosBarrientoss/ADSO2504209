package accesodatos;

public class ImplementacionMongoDataBase implements IAccesoDatos{
    @Override
    public void insertar() {
        System.out.println("Insertando datos desde MongoDB");
    }

    @Override
    public void listar() {
        System.out.println("Listando datos desde MongoDB");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando datos desde MongoDB");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando datos desde MongoDB");
    }
}
