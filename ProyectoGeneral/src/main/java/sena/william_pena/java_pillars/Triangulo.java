package proyecto_java;

import java.io.FileReader;

public class Triangulo extends FigurasGeometricas {

    public Triangulo() {
        super();
    }

    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        super.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        super.altura = altura;
    }

    @Override
    public double hallarArea(){

        double area = (super.base * super.altura) / 2;
        System.out.println(String.format("Area del triangulo: %.2f", area));
        return area;
    }

    @Override
    public double hallarPerimetro() {

        double perimetro = super.base * 3;
        System.out.println(String.format("Perimetro del triangulo: %.2f", perimetro));
        return perimetro;
    }
}
