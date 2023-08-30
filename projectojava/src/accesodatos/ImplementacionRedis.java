package accesodatos;


public class ImplementacionRedis implements IAccesoDatos{
    @Override
    public void insertar() {
        System.out.println("Insertando desde Redis");
    }

    @Override
    public void listar() {
        System.out.println("Listando desde Redis");

    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando desde Redis");

    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando desde Redis");
    }
}
