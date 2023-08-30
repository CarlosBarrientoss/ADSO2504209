import accesodatos.IAccesoDatos;
import accesodatos.ImplementacionMongoDB;
import accesodatos.ImplementacionMySql;
import accesodatos.ImplementacionOracle;
import accesodatos.ImplementacionPostgreSql;
import accesodatos.ImplementacionRedis;
public class Principal {
   
    public static void main(String[] args) {
    IAccesoDatos datos = new ImplementacionPostgreSql();
    IAccesoDatos datos2 = new ImplementacionPostgreSql();
    IAccesoDatos datos3 = new ImplementacionPostgreSql();
    
    insertarGeneral(datos);
    actualizarGeneral(datos2);
    actualizarEliminar(datos3);
   
    System.out.println(" ");
    
    datos = new ImplementacionMySql();
    datos2 = new ImplementacionMySql();
    datos3 = new ImplementacionMySql();
    
    insertarGeneral(datos);
    actualizarGeneral(datos2);
    actualizarEliminar(datos3);

    System.out.println(" ");
    
    datos = new ImplementacionOracle();
    datos2 = new ImplementacionOracle();
    datos3 = new ImplementacionOracle();

    insertarGeneral(datos);
    actualizarGeneral(datos2);
    actualizarEliminar(datos3);

    System.out.println(" ");
    
    datos2 = new ImplementacionMongoDB();
    datos = new ImplementacionMongoDB();
    datos3 = new ImplementacionMongoDB();

    insertarGeneral(datos);
    actualizarGeneral(datos2);
    actualizarEliminar(datos3);

    System.out.println(" ");
    
    datos2 = new ImplementacionRedis();
    datos = new ImplementacionRedis();
    datos3 = new ImplementacionRedis();

    insertarGeneral(datos);
    actualizarGeneral(datos2);
    actualizarEliminar(datos3);

}    

    public static void insertarGeneral(IAccesoDatos dato) {
        dato.insertar();
    }
    
    public static void actualizarGeneral(IAccesoDatos datos2) {
        datos2.actualizar();
    }
    public static void actualizarEliminar(IAccesoDatos datos3) {
        datos3.eliminar();
    }
    
}
