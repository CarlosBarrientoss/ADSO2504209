package accesodatos;

public class ImplementacionAmazonAurora implements IAccesoDatos{
    @Override
    public void insertar() {
        System.out.println("Insertando datos desde Amazon Aurora");
    }

    @Override
    public void listar() {
        System.out.println("Listando datos desde Amazon Aurora");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando datos desde Amazon Aurora");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando datos desde Amazon Aurora");
    }
}
