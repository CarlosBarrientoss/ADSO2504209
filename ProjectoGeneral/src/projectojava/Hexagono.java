package projectojava;
import java.math.*;
public class Hexagono{
    private double lado;

    public Hexagono(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public void hallarArea(){
        double area = (3*Math.cbrt(3)*(lado*lado));
        System.out.println("El area del hexagono es de: " + area);
        
    }
    
    public void hallarPerimetro(){
        double perimetro = lado*6;
    }
}
