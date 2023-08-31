package figuras;


public class Paralelogramo extends Figura {




    public Paralelogramo(double base, double altura) {
        super(base, altura);
       
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
        double area = base * altura;
        System.out.println("El area del paralelogramo es " + area);
        
    }

    @Override
    public void hallarPerimetro() {
        double perimetro = (base + altura) * 2;
        System.out.println("El perimetro del paralelogramo es " + perimetro);
        
    }
    
    
    
}
