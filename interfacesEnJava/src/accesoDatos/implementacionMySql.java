package accesoDatos;

public class implementacionMySql implements IAaccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertando datos desde MySql");
    }

    @Override
    public void listar() {
        System.out.println("Listando datos desde MySql");

    }

    @Override
    public void actualizar() {
        System.out.println("Actualizano datos desde MySql");

    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando datos desde MySql");

    }
}
