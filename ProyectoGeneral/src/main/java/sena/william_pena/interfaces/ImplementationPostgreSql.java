package sena.william_pena.interfaces;

public class ImplementationPostgreSql implements IDataAccess{

    @Override
    public void insert() {
        System.out.println("Inserting from PostgreSql");
    }

    @Override
    public void delete() {
        System.out.println("Deleting from PostgreSql");
    }

    @Override
    public void list() {
        System.out.println("Listing from PostgreSql");
    }

    @Override
    public void update() {
        System.out.println("Updating from PostgreSql");
    }
}
