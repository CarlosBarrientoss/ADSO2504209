import accesodatos.IAccesoADatos;
import accesodatos.ImplementacionAmazonAurora;
import accesodatos.ImplementacionFireBase;
import accesodatos.ImplementacionMySql;
import accesodatos.ImplementacionOracle;
import accesodatos.ImplementacionPostgreSQL;
import accesodatos.ImplementaiconMongoDB;

public class AccesoDatosMain {
    
    public static void main(String[] args) {

        IAccesoADatos datos;

        datos = new ImplementacionPostgreSQL();
        insertarGeneral(datos);
        actualizarGeneral(datos);
        listarGeneral(datos);
        eliminarGeneral(datos);

        System.out.println(" ");

        datos = new ImplementacionAmazonAurora();
        insertarGeneral(datos);
        actualizarGeneral(datos);
        listarGeneral(datos);
        eliminarGeneral(datos);
        System.out.println(" ");

        datos = new ImplementacionFireBase();
        insertarGeneral(datos);
        actualizarGeneral(datos);
        listarGeneral(datos);
        eliminarGeneral(datos);

        System.out.println(" ");

        datos = new ImplementacionMySql();
        insertarGeneral(datos);
        actualizarGeneral(datos);
        listarGeneral(datos);
        eliminarGeneral(datos);

        System.out.println(" ");

        datos = new ImplementacionOracle();
        insertarGeneral(datos);
        actualizarGeneral(datos);
        listarGeneral(datos);
        eliminarGeneral(datos);

        System.out.println(" ");
        
        datos = new ImplementaiconMongoDB();
        insertarGeneral(datos);
        actualizarGeneral(datos);
        listarGeneral(datos);
        eliminarGeneral(datos);

       }
    


    public static void insertarGeneral(IAccesoADatos datos) {
        datos.Insertar();
    }

    public static void actualizarGeneral(IAccesoADatos datos) {
        datos.actualizar();
    }

    public static void listarGeneral(IAccesoADatos datos) {
        datos.listar();
    }

    public static void eliminarGeneral(IAccesoADatos datos) {
        datos.eliminar();
    }


}
