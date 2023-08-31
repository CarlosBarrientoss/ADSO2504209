package accesodatos;

public interface IAccesoDatos {

    // Comportamientos en común con las clases hijas
    void insertar();
    void listar();
    void actualizar();
    void eliminar();
}