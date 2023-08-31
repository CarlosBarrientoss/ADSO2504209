
import accesodatos.IAccesoDatos;
import accesodatos.ImplementacionMongoDB;
import accesodatos.ImplementacionMysql;
import accesodatos.ImplementacionOracle;
import accesodatos.ImplementacionPostgreSql;
import accesodatos.ImplementandoRedis;

public class Principal {

    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionPostgreSql();
        insertarGeneral(datos);
        actualizarGeneral(datos);
        eliminandoGeneral(datos);
        System.out.println("  ");
        
        
        
        datos = new ImplementacionMysql();
        insertarGeneral(datos);
        actualizarGeneral(datos);
        eliminandoGeneral(datos);
        listarGeneral(datos);
        System.out.println("  ");
        
        
        datos = new ImplementacionOracle();
        insertarGeneral(datos);
        actualizarGeneral(datos);
        eliminandoGeneral(datos);
        listarGeneral(datos);
        System.out.println("  ");
        
        
        datos = new ImplementacionMongoDB();
        insertarGeneral(datos);
        actualizarGeneral(datos);
        eliminandoGeneral(datos);
        listarGeneral(datos);
        System.out.println("  ");
        
        
        datos = new ImplementandoRedis();
        insertarGeneral(datos);
        actualizarGeneral(datos);
        eliminandoGeneral(datos);
        listarGeneral(datos);
        
       
    }

    public static void insertarGeneral(IAccesoDatos datos) {
        datos.insertar();
    }
    
    public static void actualizarGeneral(IAccesoDatos datos){
        datos.actualizar();
    }
    
    public static void eliminandoGeneral(IAccesoDatos datos){
        datos.eliminar();
    }
    
    public static void listarGeneral(IAccesoDatos datos){
        datos.listar();
    }
}
