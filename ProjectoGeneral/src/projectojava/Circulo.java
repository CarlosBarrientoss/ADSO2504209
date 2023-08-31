package projectojava;

public class Circulo implements IFigura{
    private double pi;
    private double radio;

    public Circulo(double pi, double radio) {
        this.pi = pi;
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void hallarArea(){
        pi = 3.141516;
        double area  = pi*(radio*radio);
        System.out.println("El area del circulo es de: "+ area);
    }
    public void hallarPerimetro(){
        pi = 3.141516;
        double perimetro = 2*pi*radio;
        System.out.println("El perimetro del circulo es de: "+ perimetro);
    }
    
   
}

