package accesodatos;

public class ImplementacionFireBase implements IAccesoADatos {

    @Override
    public void Insertar() {
        System.out.println("Insertando datos desde FireBase");
    }

    @Override
    public void listar() {
       System.out.println("Listando datos desde FireBase");
    }

    @Override
    public void actualizar() {
       System.out.println("Actualizando datos desde FireBase");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando datos desde FireBase");
    }
    
}
