
package accesodatos;


public interface IAccesoADatos { 
 
    // comportamiento en comun de las clases hijas
    void Insertar();
    void listar();
    void actualizar();
    void eliminar();
}
