package sena.william_pena.interfaces;

public class ImplementationH2 implements IDataAccess {
    @Override
    public void insert() {
        System.out.println("Inserting from H2 database");
    }

    @Override
    public void delete() {
        System.out.println("Deleting from H2 database");
    }

    @Override
    public void list() {
        System.out.println("Listing from H2 database");
    }

    @Override
    public void update() {
        System.out.println("Updating from H2 database");
    }
}
