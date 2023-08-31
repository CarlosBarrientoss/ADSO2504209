package figuras;

public class Hexagono extends Figura {

    public Hexagono(double base, double altura) {
        super(base, altura);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void hallarArea() {
        double area = (6 * base) * altura / 2;
        System.out.println("El area del hexagono es " + area);
    }

    @Override
    public void hallarPerimetro() {
        double perimetro = 6 * base;
        System.out.println("El perimetro del hexagono es " + perimetro);
    }
    
}
