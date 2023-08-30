package AccesoDatos;

public class ImplementacionMysql implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insetando datos desde Mysql");
    }

    @Override
    public void listar() {
        System.out.println("listando datos desde Mysql");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizanado datos desde Mysql");
    }

    @Override
    public void eliminar() {
        System.out.println("eliminando datos desde Mysql");
    }

}
