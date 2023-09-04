package sena.juanCeferino.interfaces;

public class ImplementationOracle implements IDataAccess{
    @Override
    public void insert() {
        System.out.println("Inserting from Oracle");
    }

    @Override
    public void delete() {
        System.out.println("Deleting from Oracle");
    }

    @Override
    public void list() {
        System.out.println("Listing from Oracle");
    }

    @Override
    public void update() {
        System.out.println("Updating from Oracle");
    }
}
