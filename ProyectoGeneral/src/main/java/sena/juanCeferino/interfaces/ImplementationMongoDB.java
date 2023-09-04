package sena.juanCeferino.interfaces;

public class ImplementationMongoDB implements IDataAccess {
    @Override
    public void insert() {
        System.out.println("Inserting from MongoDB");
    }

    @Override
    public void delete() {
        System.out.println("Deleting from MongoDB");
    }

    @Override
    public void list() {
        System.out.println("Listing from MongoDB");
    }

    @Override
    public void update() {
        System.out.println("Updating from MongoDB");
    }
}
