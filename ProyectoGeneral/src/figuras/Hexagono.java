package figuras;

public class Hexagono extends Figura {

    public Hexagono(double base, double altura) {
        super(base, altura);
    }

    @Override
    public void hallarArea() {
        double area = (6 * base) * altura / 2;
        System.out.println("Área del hexágono: " + area);
    }

    @Override
    public void hallarPerimetro() {
        double perimetro = 6 * base;
        System.out.println("Perímetro del hexágono: " + perimetro);
    }
    
}
