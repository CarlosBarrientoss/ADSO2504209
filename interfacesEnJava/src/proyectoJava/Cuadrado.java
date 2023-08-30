package proyectoJava;

public class Cuadrado extends FigurasGeometricas{

    public Cuadrado (){

    }
    public Cuadrado(double base){
        super(base);
    }
    @Override
    double hallarArea() {
        double area = base * base;
        System.out.println("El area del cuadrado es: " + area);
        return area;
    }

    @Override
    double hallarPerimetro() {
        double perimetro = base * 4;
        System.out.println("El perimetro del cuadrado es: " + perimetro);
        return perimetro;
    }
}
