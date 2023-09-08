package accesodatos;

public class ImplementacionOracle implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertando desde Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listando desde Oracle");

    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando desde Oracle");

    }

    @Override
    public void eliminar() {
        System.out.println("Eliminado desde Oracle");
    }

}
