package figuras;

public class Pentagono extends Figura {

    public Pentagono(double base, double altura) {
        super(base, altura);
    }

    @Override
    public void hallarArea() {
        double area = (5 * base) * altura / 2;
        System.out.println("Área del pentágono: " + area);
    }

    @Override
    public void hallarPerimetro() {
        double perimetro = 5 * base;
        System.out.println("Perímetro del pentágono: " + perimetro);
    }

    
    
}
