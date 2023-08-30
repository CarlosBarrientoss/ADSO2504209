package proyectoJava;

public class Triangulo extends FigurasGeometricas{

    public Triangulo (){

    }
    public Triangulo (double base, double altura){
        super(base, altura);
    }

    @Override
    double hallarArea() {
        double area = (base * altura)/2;
        System.out.println("El area del triangulo es: " + area);
        return area;
    }

    @Override
    double hallarPerimetro() {
        double perimetro = base * 3;
        System.out.println("El perimetro del triangulo es: " + perimetro);
        return perimetro;
    }
}
