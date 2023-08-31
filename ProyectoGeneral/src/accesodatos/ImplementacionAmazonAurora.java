package accesodatos;

public class ImplementacionAmazonAurora implements IAccesoADatos {
    
    @Override
    public void Insertar() {
        System.out.println("Insertando datos desde AmazonAurora");
    }

    @Override
    public void listar() {
       System.out.println("Listando datos desde AmazonAurora");
    }

    @Override
    public void actualizar() {
       System.out.println("Actualizando datos desde AmazonAurora");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando datos desde AmazonAurora");
    }
}
