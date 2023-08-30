import accesodatos.IAccesoDatos;
import accesodatos.ImplementacionFirebird;
import accesodatos.ImplementacionMongoDB;
import accesodatos.ImplementacionMySql;
import accesodatos.ImplementacionOracle;
import accesodatos.ImplementacionPostgreSql;

public class Principal {

    public static void main(String[] args) {

        IAccesoDatos datos;

        datos = new ImplementacionPostgreSql();
        // insertarGeneral(datos);
        // actualizarGeneral(datos);
        // eliminarGeneral(datos);
        // listarGeneral(datos);

        System.out.println(" ");

        datos = new ImplementacionMySql();
        // insertarGeneral(datos);
        // actualizarGeneral(datos);
        // eliminarGeneral(datos);
        // listarGeneral(datos);
        superGeneral(datos);

        System.out.println(" ");

        datos = new ImplementacionOracle();
        // insertarGeneral(datos);
        // actualizarGeneral(datos);
        // eliminarGeneral(datos);
        // listarGeneral(datos);
        superGeneral(datos);

        System.out.println(" ");

        datos = new ImplementacionMongoDB();
        // insertarGeneral(datos);
        // actualizarGeneral(datos);
        // eliminarGeneral(datos);
        // listarGeneral(datos);
        superGeneral(datos);

        System.out.println(" ");

        datos = new ImplementacionFirebird();
        // insertarGeneral(datos);
        // actualizarGeneral(datos);
        // eliminarGeneral(datos);
        // listarGeneral(datos);
        superGeneral(datos);

        System.out.println(" ");

    }

    // public static void insertarGeneral(IAccesoDatos dato) {
    //     dato.insertar();
    // }

    // public static void actualizarGeneral(IAccesoDatos dato) {
    //     dato.actualizar();
    // }

    // public static void eliminarGeneral(IAccesoDatos dato) {
    //     dato.eliminar();
    // }

    // public static void listarGeneral(IAccesoDatos dato) {
    //     dato.listar();
    // }

    public static void superGeneral(IAccesoDatos dato) {
        dato.insertar();
        dato.actualizar();
        dato.eliminar();
        dato.listar();
    }
}
