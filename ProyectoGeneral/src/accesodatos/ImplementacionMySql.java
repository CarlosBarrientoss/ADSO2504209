package accesodatos;

public class ImplementacionMySql implements IAccesoADatos  {

    @Override
    public void Insertar() {
        System.out.println("Insertando datos desde MySql");
    }

    @Override
    public void listar() {
       System.out.println("Listando datos desde MySql");
    }

    @Override
    public void actualizar() {
       System.out.println("Actualizando datos desde MySql");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando datos desde MySql");
    }
}
    
    