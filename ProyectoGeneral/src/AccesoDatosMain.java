import accesodatos.IAccesoDatos;
import accesodatos.ImplementacionAmazonAurora;
import accesodatos.ImplementacionAzureSqlDb;
import accesodatos.ImplementacionMySql;
import accesodatos.ImplementacionOracle;
import accesodatos.ImplementacionPostgreSql;

public class AccesoDatosMain {

    public static void main(String[] args) {

        IAccesoDatos datos;

        datos = new ImplementacionPostgreSql();
        insertarGeneral(datos);
        actualizarGeneral(datos);
        eliminarGeneral(datos);
        listarGeneral(datos);
        System.out.println("");

        datos = new ImplementacionMySql();
        insertarGeneral(datos);
        actualizarGeneral(datos);
        eliminarGeneral(datos);
        listarGeneral(datos);
        System.out.println("");

        datos = new ImplementacionAmazonAurora();
        insertarGeneral(datos);
        actualizarGeneral(datos);
        eliminarGeneral(datos);
        listarGeneral(datos);
        System.out.println("");

        datos = new ImplementacionOracle();
        insertarGeneral(datos);
        actualizarGeneral(datos);
        eliminarGeneral(datos);
        listarGeneral(datos);
        System.out.println("");

        datos = new ImplementacionAzureSqlDb();
        insertarGeneral(datos);
        actualizarGeneral(datos);
        eliminarGeneral(datos);
        listarGeneral(datos);
        System.out.println("");
    }

    // Polimorfismo
    public static void insertarGeneral(IAccesoDatos datos) {
        datos.insertar();
    }

    public static void eliminarGeneral(IAccesoDatos datos) {
        datos.eliminar();
    }

    public static void actualizarGeneral(IAccesoDatos datos) {
        datos.actualizar();
    }

    public static void listarGeneral(IAccesoDatos datos) {
        datos.listar();
    }
}
