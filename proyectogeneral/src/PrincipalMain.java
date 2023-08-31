

import accesoadatos.AccesoADatos;
import accesoadatos.ImplementacionMariaDB;
import accesoadatos.ImplementacionMongoDB;
import accesoadatos.ImplementacionMySql;
import accesoadatos.ImplementacionPostgreSQL;
import accesoadatos.ImplrementacionOracle;


public class PrincipalMain {
    public static void main(String[] args) {
        AccesoADatos datos= new ImplementacionPostgreSQL();
        insertarGeneral(datos);
        datos = new ImplementacionMariaDB();
        insertarGeneral(datos);
        datos= new ImplementacionMySql();
        insertarGeneral(datos);
        datos = new ImplrementacionOracle();
        insertarGeneral(datos);
        datos = new ImplementacionMongoDB();
        insertarGeneral(datos);
    }
    public static void insertarGeneral(AccesoADatos dato){
dato.insertar();
}
}

