package accesodatos;


public class ImplementacionMongoDB implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertando desde MongoDB");
    }

    @Override
    public void listar() {
        System.out.println("Listando desde MongoDB");

    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando desde MongoDB");

    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando desde MongoDB");
    }
    
}
