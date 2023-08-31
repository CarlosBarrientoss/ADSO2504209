package accesodatos;

public class ImplementacionOracle implements IAccesoADatos {

    @Override
    public void Insertar() {
        System.out.println("Insertando datos desde Oracle");
    }

    @Override
    public void listar() {
       System.out.println("Listando datos desde Oracle");
    }

    @Override
    public void actualizar() {
       System.out.println("Actualizando datos desde Oracle");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando datos desde Oracle");
    }
}
