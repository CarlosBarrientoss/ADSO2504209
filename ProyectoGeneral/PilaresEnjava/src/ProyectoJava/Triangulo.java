package ProyectoJava;

public class Triangulo implements IFiguras {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
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
    public void hallarArea() {
        // Logica para hallar el area del rectangulo
        double area = (base * altura) / 2;
        System.out.println(" El area del rectangulo es: " + area);

    }

    public void hallarPerimetro() {
        // Logica para hallar el perimetro del rectangulo
        double perimetro = base + base + base;
        System.out.println(" Perimetro del rectangulo es: " + perimetro);
    }

}
