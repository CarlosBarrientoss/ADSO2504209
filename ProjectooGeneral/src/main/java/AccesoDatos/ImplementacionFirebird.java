package AccesoDatos;

public class ImplementacionFirebird implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insetando datos desde Firebird");
    }

    @Override
    public void listar() {
        System.out.println("listando datos desde Firebird");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizanado datos desde Firebird");
    }

    @Override
    public void eliminar() {
        System.out.println("eliminando datos desde Firebird");
    }

}
