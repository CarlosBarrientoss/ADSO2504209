package accesodatos;

public class ImplementacionMongoDB implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("insertando datos desde mongobd ");
    }

    @Override
    public void listar() {
        System.out.println("listando datos desde mongobd");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizando datos desde mongobd");
    }

    @Override
    public void eliminar() {
        System.out.println("elimnando datos desde mogobd");
    }

}
