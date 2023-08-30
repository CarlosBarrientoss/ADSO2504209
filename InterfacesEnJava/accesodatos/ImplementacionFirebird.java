package accesodatos;

public class ImplementacionFirebird implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertando datos desde Firebird");
    }

    @Override
    public void listar() {
        System.out.println("Listando datos desde Firebird");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando datos desde Firebird");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando datos desde Firebird");
    }
    
}
