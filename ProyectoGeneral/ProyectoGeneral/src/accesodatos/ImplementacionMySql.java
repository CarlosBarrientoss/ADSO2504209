package accesodatos;

public class ImplementacionMySql implements IAccesoDatos {

    @Override
    public void insertar() {
      System.out.println("Insertando desde MySql");
    }

    @Override
    public void listar() {
        System.out.println("Listando desde MySql");

    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando desde MySQL");
    
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminado desde MySql");
  
    }
    
}
