package projectojava;
public class Trapecio implements IFigura{

    private double lado1;
    private double lado2;
    private double lado3;
    private double lado4;
    private double altura;
    private double baseMa; 
    private double baseMe;

    public Trapecio(double lado1, double lado2, double lado3, double lado4, double altura, double baseMa, double baseMe) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
        this.altura = altura;
        this.baseMa = baseMa;
        this.baseMe = baseMe;
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBaseMa() {
        return baseMa;
    }

    public void setBaseMa(double baseMa) {
        this.baseMa = baseMa;
    }

    public double getBaseMe() {
        return baseMe;
    }

    public void setBaseMe(double baseMe) {
        this.baseMe = baseMe;
    }
    
    public void hallarPerimetro(){
        double perimetro = lado1+lado2+lado3+lado4;
        System.out.println("El perimetro del trapecio es de: " + perimetro);
        
    }
    public void hallarArea(){
        double area = (baseMa+baseMe*(altura))/2;
        System.out.println("El area del trapecio es de: "+ area);
    }
}
