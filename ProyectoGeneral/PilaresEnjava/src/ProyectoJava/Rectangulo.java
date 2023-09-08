package ProyectoJava;

public class Rectangulo implements IFiguras {
    // Abstraccion del problema
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void hallarArea() {
        // Logica para hallar el area del rectangulo
        double area = base * altura;
        System.out.println(" El area del triangulo es: " + area);

    }

    public void hallarPerimetro() {
        // Logica para hallar el perimetro del rectangulo
        double perimetro = 2 * (base + altura);
        System.out.println(" Perimetro del triangulo es: " + perimetro);
    }

    // Tercer elemento de la programacion orientada a objetos (los metodos)
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

}
