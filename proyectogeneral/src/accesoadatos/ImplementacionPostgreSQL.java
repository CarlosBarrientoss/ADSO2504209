
package accesoadatos;
public class ImplementacionPostgreSQL implements AccesoADatos {

    @Override
    public void insertar() {
        System.out.println("Insertando desde post");}

    @Override
    public void listar() {
        System.out.println("Listar desde post");    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando desde post");    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando desde post");    }
    
    
    
    
    
}
