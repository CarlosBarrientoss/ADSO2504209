
package accesodatos;

public class ImplementandoRedis  implements IAccesoDatos{

    @Override
    public void insertar() {
       System.out.println("insertando datos desde Redis ");
    }

    @Override
    public void listar() {
        System.out.println("listando datos desde Redis");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizando datos desde Redis"); 
    }

    @Override
    public void eliminar() {
        System.out.println("elimnando datos desde Redis"); 
    }
    
}
