package accesodatos;

public class ImplementacionFireBase implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertando desde FireBase");
    }

    @Override
    public void listar() {
        System.out.println("Listando desde FireBase");

    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando desde FireBase");

    }

    @Override
    public void eliminar() {
        System.out.println("Eliminado desde FireBase");

    }

}
