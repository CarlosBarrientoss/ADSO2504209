import accesodatos.IAccesoDatos;
import accesodatos.ImplementacionPostgreSql;
import accesodatos.ImplementacionMySql;
import accesodatos.ImplementacionAmazonAurora;
import accesodatos.ImplementacionMongoDataBase;
import accesodatos.ImplementacionOracle;


public class Main {
    public static void main(String[] args) {

        IAccesoDatos datos;

        System.out.println();

        datos = new ImplementacionPostgreSql();
        insertarGeneral(datos);
        listargeneral(datos);
        actualizargeneral(datos);
        eliminargeneral(datos);

        System.out.println();

        datos = new ImplementacionMySql();
        insertarGeneral(datos);
        insertarGeneral(datos);
        actualizargeneral(datos);
        eliminargeneral(datos);

        System.out.println();

        datos = new ImplementacionMongoDataBase();
        insertarGeneral(datos);
        insertarGeneral(datos);
        actualizargeneral(datos);
        eliminargeneral(datos);

        System.out.println();

        datos = new ImplementacionOracle();
        insertarGeneral(datos);
        insertarGeneral(datos);
        actualizargeneral(datos);
        eliminargeneral(datos);

        System.out.println();

        datos = new ImplementacionAmazonAurora();
        insertarGeneral(datos);
        insertarGeneral(datos);
        actualizargeneral(datos);
        eliminargeneral(datos);

    }

    public static void insertarGeneral(IAccesoDatos dato){

        dato.insertar();
    }

    public static void listargeneral(IAccesoDatos dato){

        dato.listar();
    }

    public static void actualizargeneral(IAccesoDatos dato){

        dato.actualizar();
    }

    public static void eliminargeneral(IAccesoDatos dato){

        dato.eliminar();
    }
}