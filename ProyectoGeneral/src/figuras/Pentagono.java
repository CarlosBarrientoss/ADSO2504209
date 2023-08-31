package figuras;

public class Pentagono extends Figura {

    public Pentagono(double base, double altura) {
        super(base, altura);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void hallarArea() {
        double area = (5 * base) * altura / 2;
        System.out.println("Area del pentagono " + area);
    }

    @Override
    public void hallarPerimetro() {
        double perimetro = 5 * base;
        System.out.println("perimetro del pentagono " + perimetro);
    }
    


    }

