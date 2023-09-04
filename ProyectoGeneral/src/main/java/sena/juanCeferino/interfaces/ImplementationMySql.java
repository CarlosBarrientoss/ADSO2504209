package sena.juanCeferino.interfaces;

public class ImplementationMySql implements IDataAccess{
    @Override
    public void insert() {
        System.out.println("Inserting from MySql");
    }

    @Override
    public void delete() {
        System.out.println("Deleting from MySql");
    }

    @Override
    public void list() {
        System.out.println("Listing from MySql");
    }

    @Override
    public void update() {
        System.out.println("Updating from MySql");
    }
}
