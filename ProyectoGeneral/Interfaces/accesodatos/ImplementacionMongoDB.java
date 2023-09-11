package Interfaces.accesodatos;

public class ImplementacionMongoDB implements IAccesoDatos{
    public ImplementacionMongoDB() {
    }

    public void insertar() {
        System.out.println("Insertando datos desde MongoDB");
    }

    public void listar() {
        System.out.println("Listando datos desde MongoDB");
    }

    public void actualizar() {
        System.out.println("Actualizando datos desde MongoDB");
    }

    public void eliminar() {
        System.out.println("Eliminando datos desde MongoDBs");
    }
}
