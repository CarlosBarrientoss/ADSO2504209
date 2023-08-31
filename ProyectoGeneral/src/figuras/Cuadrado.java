package figuras;

public class Cuadrado extends Figura {



    public Cuadrado(double base, double altura) {
        super(base, altura);
        //TODO Auto-generated constructor stub
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
        double area = (base * 2) + (altura * 2);
        System.out.println("El area del cuadrado es " + area);
    }

    @Override
    public void hallarPerimetro() {
         double area = (base * altura);
        System.out.println("El perimetro del cuadrado es "  + base);
        
    }
}
