package accesodatos;

public class ImplementacionOracle implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertando datos desde Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listando datos desde Oracle");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando datos desde Oracle");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando datos desde Oracle");
    }
}
