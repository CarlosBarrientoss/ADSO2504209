package AccesoDatos;

public class ImplementaciionMongoDB implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insetando datos desde MongoDB");
    }

    @Override
    public void listar() {
        System.out.println("listando datos desde MongoDB");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizanado datos desde MongoDB");
    }

    @Override
    public void eliminar() {
        System.out.println("eliminando datos desde MongoDB");
    }

    public ImplementaciionMongoDB() {
    }

}
