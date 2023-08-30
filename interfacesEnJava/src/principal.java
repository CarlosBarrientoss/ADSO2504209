import accesoDatos.*;

public class principal {

    public static void main(String[] args) {
//implementar interfaces
        IAaccesoDatos datos;

        datos = new implementacionMySql();
        insertarGeneral(datos);
        listarGeneral(datos);
        actualizarGeneral(datos);
        eliminarGeneral(datos);
        System.out.println("...");

        datos = new implementacionOracle();
        insertarGeneral(datos);
        listarGeneral(datos);
        actualizarGeneral(datos);
        eliminarGeneral(datos);
        System.out.println("...");

        datos = new implementacionPosSql();
        insertarGeneral(datos);
        listarGeneral(datos);
        actualizarGeneral(datos);
        eliminarGeneral(datos);
        System.out.println("...");

        datos = new implementacionH2();
        insertarGeneral(datos);
        listarGeneral(datos);
        actualizarGeneral(datos);
        eliminarGeneral(datos);
        System.out.println("...");

        datos = new implementacionMongoDb();
        insertarGeneral(datos);
        listarGeneral(datos);
        actualizarGeneral(datos);
        eliminarGeneral(datos);
        System.out.println("...");

    }

    public static void insertarGeneral(IAaccesoDatos dato) {
        dato.insertar();
    }

    public static void listarGeneral(IAaccesoDatos dato){
        dato.listar();
    }

    public static void actualizarGeneral(IAaccesoDatos dato){
        dato.actualizar();
    }

    public static void eliminarGeneral(IAaccesoDatos dato){
        dato.eliminar();
    }
}
