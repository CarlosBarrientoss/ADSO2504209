package sena.juanCeferino.java_pillars;

public class Rectangulo implements IGeometricFigures {

    private double base;
    private double altura;

    public Rectangulo(){

    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calculateArea(){

        // Logica para hallar el area de un rectangulo
        double area = this.base * this.altura;
        System.out.println(String.format("Area del rectangulo: %.2f", area));
        return area;
    }

    @Override
    public double calculatePerimeter(){
        // Lógica para hallar el perimetro de un rextangulo
        double perimeter = (this.base + this.altura) * 2;
        System.out.println(String.format("Perimetro del rectangulo: %.2f", perimeter));
        return perimeter;
    }
}
