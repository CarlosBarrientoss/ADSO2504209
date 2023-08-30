
import AccesoDatos.IAccesoDatos;
import AccesoDatos.ImplememtacionPostgreSql;
import AccesoDatos.ImplementacionMysql;
import AccesoDatos.ImplementacionOracle;
import AccesoDatos.ImplementaciionMongoDB;
import AccesoDatos.ImplementacionFirebird;

public class Principal {

    public static void main(String[] args) {

        IAccesoDatos datos;

        datos = new ImplememtacionPostgreSql();
        insertarGeneral(datos);
        actualizarGeneral(datos);
        datos.listar();
        datos.eliminar();

        System.out.println("");

        datos = new ImplementacionMysql();
        insertarGeneral(datos);
        actualizarGeneral(datos);
        datos.listar();
        datos.eliminar();

        System.out.println("");

        datos = new ImplementacionOracle();
        insertarGeneral(datos);
        actualizarGeneral(datos);
        datos.listar();
        datos.eliminar();
        System.out.println("");

        datos = new ImplementaciionMongoDB();
        insertarGeneral(datos);
        actualizarGeneral(datos);
        datos.listar();
        datos.eliminar();
        System.out.println("");

        datos = new ImplementacionFirebird();
        insertarGeneral(datos);
        actualizarGeneral(datos);
        datos.listar();
        datos.eliminar();

    }

    public static void insertarGeneral(IAccesoDatos datos) {

        datos.insertar();

    }

    public static void actualizarGeneral(IAccesoDatos datos) {
        datos.actualizar();

    }

    public static void ListarGeneral(IAccesoDatos datos) {
        datos.listar();

    }

    public static void eliminarGeneral(IAccesoDatos datos) {
        datos.eliminar();

    }
}
