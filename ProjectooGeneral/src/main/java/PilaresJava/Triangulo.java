package PilaresJava;
public class Triangulo implements IFigura {
    
    private double base;
    private double altura;
    private double lado1;
    private double lado2;

    public Triangulo(double base, double altura, double lado1, double lado2){

        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    @Override
    public void hallarArea(){

        double area = ((base*altura)/2);
        System.out.println(" El area del triangulo es = " + area);
    }

    public void hallarPerimetro(){

        double perimetro = (base + lado1 + lado2);
        System.out.println(" El perimetro del triangulo es = " + perimetro);

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

    

}
