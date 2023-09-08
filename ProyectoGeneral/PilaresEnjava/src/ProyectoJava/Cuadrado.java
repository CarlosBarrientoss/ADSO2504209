package ProyectoJava;

public class Cuadrado extends Figuras {

    public Cuadrado(double base, double altura) {
        super(base, altura);
    }

    @Override
    public void hallarArea() {
        double area = base * altura;
        System.out.println("El area del cuadrado es ");
    }

    @Override
    public void hallarPerimetro() {
        double area;

    }

}
