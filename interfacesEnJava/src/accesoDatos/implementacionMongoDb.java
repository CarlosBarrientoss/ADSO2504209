package accesoDatos;

public class implementacionMongoDb implements IAaccesoDatos{
    @Override
    public void insertar() {
        System.out.println("Insertando datos desde MongoDb");
    }

    @Override
    public void listar() {
        System.out.println("Listando datos desde MongoDb");


    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando datos desde MongoDb");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando datos desde MongoDb");
    }
}
