package accesodatos;

public class ImplementacionMongoDb implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertando desde MongoDb ");
    }

    @Override
    public void listar() {
        System.out.println("Listando desde MongoDb");

    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando desde MongoDb");

    }

    @Override
    public void eliminar() {
        System.out.println("Eliminado desde MongoDb");

    }
}
