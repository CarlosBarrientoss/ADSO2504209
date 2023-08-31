package PilaresJava;
// Primer elemento de la POO
public class Rectangulo implements IFigura{

    // Segundo elemento de la POO
     //  Abstraccion del problema
    private double base;
    private double altura;

    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Tercer elemento de la POO
    @Override
    public void hallarArea(){

        // Logica para hallar el area del rectangulo
        double area = base * altura;
        System.out.println(" El area del rectangulo es = " + area);

    }
    
    public void hallarPerimetro(){

        // Logica para hallar el perimetro del rectangulo
        double perimetro = (2 * (base + altura));
        System.out.println("El perimetro del rectangulo es = " + perimetro);
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
    
}
