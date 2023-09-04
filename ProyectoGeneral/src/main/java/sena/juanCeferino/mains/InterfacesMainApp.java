package sena.juanCeferino.mains;

import sena.juanCeferino.interfaces.*;

public class InterfacesMainApp {
    public static void main(String... args){
        IDataAccess datos;

        datos = new ImplementationPostgreSql();
        genericInsert(datos);
        genericList(datos);
        genericDelete(datos);
        genericUpdate(datos);
        System.out.println("");

        datos = new ImplementationH2();
        genericInsert(datos);
        genericList(datos);
        genericDelete(datos);
        genericUpdate(datos);
        System.out.println("");

        datos = new ImplementationOracle();
        genericInsert(datos);
        genericList(datos);
        genericDelete(datos);
        genericUpdate(datos);
        System.out.println("");

        datos = new ImplementationMongoDB();
        genericInsert(datos);
        genericList(datos);
        genericDelete(datos);
        genericUpdate(datos);
        System.out.println("");

        datos = new ImplementationMySql();
        genericInsert(datos);
        genericList(datos);
        genericDelete(datos);
        genericUpdate(datos);

    }

    public static void genericInsert(IDataAccess iAccesoDatos){
        iAccesoDatos.insert();
    }

    public static void genericDelete(IDataAccess iAccesoDatos){
        iAccesoDatos.delete();
    }

    public static void genericList(IDataAccess iAccesoDatos){
        iAccesoDatos.list();
    }

    public static void genericUpdate(IDataAccess iAccesoDatos){
        iAccesoDatos.update();
    }
}
