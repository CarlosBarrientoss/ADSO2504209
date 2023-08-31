package projectojava;

public class Paralelogramo extends Figuras {

    private double lado1;
    private double lado2;
    private double lado3;
    private double lado4;


    public Paralelogramo(double lado1, double lado2, double lado3, double lado4, double base, double altura) {
        super(base, altura);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
        ;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getLado4() {
        return lado4;
    }

    public void setLado4(double lado4) {
        this.lado4 = lado4;
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
    
    public void hallarPerimetro(){
        double perimetro = lado1+lado2+lado3+lado4;
        System.out.println("El perimetro del paralelogramo es de: " + perimetro);
        
    }
    
    public void hallarArea(){
        double area = base*altura;
        System.out.println("El area del paralelogramo es de: " + area);
    }
}
