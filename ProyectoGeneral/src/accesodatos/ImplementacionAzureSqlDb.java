package accesodatos;

public class ImplementacionAzureSqlDb implements IAccesoDatos{
    
    @Override
    public void insertar() {
        System.out.println("Insertando datos desde AzureSqlDb");
    }

    @Override
    public void listar() {
        System.out.println("Listando datos desde AzureSqlDb");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando datos desde AzureSqlDb");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando datos desde AzureSqlDb");
    }
}
