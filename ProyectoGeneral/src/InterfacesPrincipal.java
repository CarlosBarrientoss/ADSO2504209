import Interfaces.accesodatos.*;

public class InterfacesPrincipal {

    public InterfacesPrincipal() {
    }

    public static void main(String[] args) {

        IAccesoDatos datos;
        datos = new ImplementacionPostgreSql();
        insertarGeneral(datos);
        listarGeneral(datos);
        actualizarGeneral(datos);
        eliminarGeneral(datos);
        System.out.println();

        datos = new ImplementacionMySql();
        insertarGeneral(datos);
        listarGeneral(datos);
        actualizarGeneral(datos);
        eliminarGeneral(datos);
        System.out.println();

        datos = new ImplementacionOracle();
        insertarGeneral(datos);
        listarGeneral(datos);
        actualizarGeneral(datos);
        eliminarGeneral(datos);
        System.out.println();

        datos = new ImplementacionMongoDB();
        insertarGeneral(datos);
        listarGeneral(datos);
        actualizarGeneral(datos);
        eliminarGeneral(datos);
        System.out.println();

        datos = new ImplementacionAmazonAurora();
        insertarGeneral(datos);
        listarGeneral(datos);
        actualizarGeneral(datos);
        eliminarGeneral(datos);
    }

    public static void insertarGeneral(IAccesoDatos dato) {
        dato.insertar();
    }

    public static void listarGeneral(IAccesoDatos dato) {
        dato.listar();
    }

    public static void actualizarGeneral(IAccesoDatos dato) {
        dato.actualizar();
    }

    public static void eliminarGeneral(IAccesoDatos dato) {
        dato.eliminar();
    }
}
