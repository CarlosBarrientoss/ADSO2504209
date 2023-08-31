package accesodatos;

public class ImplementacionPostgreSQL implements IAccesoADatos  {

    @Override
    public void Insertar() {
        System.out.println("Insertando datos desde PostgreSQL");
    }

    @Override
    public void listar() {
       System.out.println("Listando datos desde PostgreSQL");
    }

    @Override
    public void actualizar() {
       System.out.println("Actualizando datos desde PostgreSQL");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando datos desde PostgreSQL");
    }
    
}
