package sena.william_pena.java_pillars;

public abstract class GeometricFigures {

    protected double base;
    protected double altura;

    public GeometricFigures() {
    }

    public GeometricFigures(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    public abstract double calculateArea();


    public abstract double calculatePerimeter();
}
