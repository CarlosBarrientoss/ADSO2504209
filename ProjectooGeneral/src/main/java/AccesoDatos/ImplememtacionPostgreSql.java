
package AccesoDatos;

public class ImplememtacionPostgreSql implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertando datos desde Postgre");
    }

    @Override
    public void listar() {
         System.out.println("listando datos desde Postgre");
    }

    @Override
    public void actualizar() {
         System.out.println("actualiozando datos desde Postgre");
    }

    @Override
    public void eliminar() {
         System.out.println("eliminando datos desde Postgre");
    }
    
}
