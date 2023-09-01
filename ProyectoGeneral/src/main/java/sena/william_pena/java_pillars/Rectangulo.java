package sena.william_pena.java_pillars;

public class Rectangulo extends GeometricFigures{

    // Constructores
    public Rectangulo(){
        super();
    }

    public Rectangulo(double base, double altura){
        super(base, altura);
    }

    // Metodos
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        super.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        super.altura = altura;
    }

    @Override
    public double calculateArea(){

        // Logica para hallar el area de un rectangulo
        double area = super.base * super.altura;
        System.out.println(String.format("Area del rectangulo: %.2f", area));
        return area;
    }

    @Override
    public double calculatePerimeter(){
        // Lógica para hallar el perimetro de un rextangulo
        double perimetro = (super.base + super.altura) * 2;
        System.out.println(String.format("Perimetro del rectangulo: %.2f", perimetro));
        return perimetro;
    }
}
