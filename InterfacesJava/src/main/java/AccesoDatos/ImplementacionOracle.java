package AccesoDatos;

public class ImplementacionOracle implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insetando datos desde Oracle");
    }

    @Override
    public void listar() {
        System.out.println("listando datos desde Oracle");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizanado datos desde Oracle");
    }

    @Override
    public void eliminar() {
        System.out.println("eliminando datos desde Oracle");
    }

}
