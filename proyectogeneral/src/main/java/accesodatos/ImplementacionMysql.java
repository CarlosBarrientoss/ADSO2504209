package accesodatos;

public class ImplementacionMysql implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("insertar datos desde mysql");
    }

    @Override
    public void listar() {
        System.out.println("listar datos desde mysql");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizando datos desde mysql");
    }

    @Override
    public void eliminar() {
        System.out.println("elimnando datos desde mysql");
    }

}
