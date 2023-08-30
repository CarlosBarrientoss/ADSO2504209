package accesoDatos;

public class implementacionH2 implements IAaccesoDatos{
    @Override
    public void insertar() {
        System.out.println("Insertando datos desde H2");
    }

    @Override
    public void listar() {
        System.out.println("Listando datos desde H2");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando datos desde H2");

    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando datos desde H2");

    }
}
