package proyecto_java;

public class Cuadrado extends FigurasGeometricas {


    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        base = lado;
    }

    public double getLado() {
        return base;
    }

    public void setLado(double lado) {
        this.base = lado;
    }

    @Override
    public double hallarArea() {

        double area = Math.pow(base, 2);
        System.out.println(String.format("Area del cuadrado: %.2f", area));
        return area;
    }

    @Override
    public double hallarPerimetro() {

        double perimetro = base * 4;
        System.out.println(String.format("Perimetro del cuadrado: %.2f", perimetro));
        return perimetro;
    }
}
