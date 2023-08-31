package accesodatos;

public class ImplementacionOracle implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("insertando datos desde oracle");
    }

    @Override
    public void listar() {
        System.out.println("listando datos desde oracle");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizando datos desde oracle");
    }

    @Override
    public void eliminar() {
        System.out.println("elimnando datos desde oracle");
    }

}
