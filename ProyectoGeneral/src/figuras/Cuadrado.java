package figuras;

public class Cuadrado extends Figura{

    public Cuadrado(double base, double altura) {
        super(base, altura);
    }

    @Override
    public void hallarArea() {
        double area = base * altura;
        System.out.println("El área del cuadrado es: " + area);
    }

    @Override
    public void hallarPerimetro() {
        double perímetro = base * 4;
        System.out.println("El perímetro del cuadrado es: " + perímetro);
    }
    
}
