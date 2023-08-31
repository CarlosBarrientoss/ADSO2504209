package proyectojava;

public class Triangulo implements IFigura{

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public  void hallarPerimetro(){
        double perimetro = base * 3;
        System.out.println("perimetro triangulo = " + perimetro);
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
        double area = (base * altura)/ 2;
        System.out.println("area triangulo = " + area);
    }
}
