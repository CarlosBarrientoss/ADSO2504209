
import accesodatos.IAccesoDatos;
import accesodatos.ImplementacionFireBase;
import accesodatos.ImplementacionMongoDb;
import accesodatos.ImplementacionMySql;
import accesodatos.ImplementacionOracle;
import accesodatos.ImplementacionPostgreSql;

public class AccesodatosMain {

    public static void main(String[] args) {

        IAccesoDatos datos;

        datos = new ImplementacionPostgreSql();
        insertarGeneral(datos);
        actualizarGneral(datos);
        listarGneral(datos);
        eliminarGneral(datos);

        datos = new ImplementacionFireBase();
        insertarGeneral(datos);
        actualizarGneral(datos);
        listarGneral(datos);
        eliminarGneral(datos);

        datos = new ImplementacionMongoDb();
        insertarGeneral(datos);
        actualizarGneral(datos);
        listarGneral(datos);
        eliminarGneral(datos);

        datos = new ImplementacionOracle();
        insertarGeneral(datos);
        actualizarGneral(datos);
        listarGneral(datos);
        eliminarGneral(datos);

        datos = new ImplementacionMySql();
        insertarGeneral(datos);
        actualizarGneral(datos);
        listarGneral(datos);
        eliminarGneral(datos);
    }

    // Polimorfismo
    public static void insertarGeneral(IAccesoDatos datos) {
        datos.insertar();

    }

    public static void actualizarGneral(IAccesoDatos datos) {
        datos.actualizar();
    }

    public static void listarGneral(IAccesoDatos datos) {
        datos.listar();
    }

    public static void eliminarGneral(IAccesoDatos datos) {
        datos.eliminar();
    }

}
