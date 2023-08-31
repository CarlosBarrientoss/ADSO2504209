import accesodatos.IAccesoDatos;
import accesodatos.ImplementacionFirebird;
import accesodatos.ImplementacionMongoDB;
import accesodatos.ImplementacionMySql;
import accesodatos.ImplementacionOracle;
import accesodatos.ImplementacionPostgreSql;

public class AccesosMain {

    public static void main(String[] args) {
        
        IAccesoDatos datos; 

        datos = new ImplementacionPostgreSql(); 
            // datos.insertar();
            insertarGeneraal(datos);
            actualizarGeneral(datos);
            eliminarGeneral(datos);
            listarGeneral(datos);
            espacios(datos);

        datos = new ImplementacionFirebird();
            // datos.insertar();
            insertarGeneraal(datos);
            actualizarGeneral(datos);
            eliminarGeneral(datos);
            listarGeneral(datos);
            espacios(datos);

        datos = new ImplementacionMongoDB();
            // datos.insertar();
            insertarGeneraal(datos);
            actualizarGeneral(datos);
            eliminarGeneral(datos);
            listarGeneral(datos);
            espacios(datos);


        datos = new ImplementacionMySql();
            // datos.insertar();
            insertarGeneraal(datos);
            actualizarGeneral(datos);
            eliminarGeneral(datos);
            listarGeneral(datos);
            espacios(datos);



        datos = new ImplementacionOracle();
        //            datos.insertar();
            insertarGeneraal(datos);
            actualizarGeneral(datos);
            eliminarGeneral(datos);
            listarGeneral(datos);
        }
    
    public static void insertarGeneraal(IAccesoDatos datos){
        datos.insertar();
    }
    public static void actualizarGeneral(IAccesoDatos datos){
        datos.actualizar();
    }
    public static void espacios(IAccesoDatos datos){
        System.out.println("");
    }
    public static void eliminarGeneral(IAccesoDatos datos){
        datos.eliminar();
    }
    public static void listarGeneral(IAccesoDatos datos){
        datos.listar();
    }
    public static void general(IAccesoDatos datos){
        datos.actualizar();
    }
}
