package projectojava;

public class  Cuadrado implements IFigura{
    
    private double lado1;

    public Cuadrado(double lado) {
        this.lado1 = lado;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    public void hallarArea(){
        double area = lado1*lado1;
        System.out.println("El area del cuadrado es de: " + area);
    }
    public void hallarPerimetro(){
        double perimetro = lado1*4;
        System.out.println("El perimtro de el cuadrado es de: "+ perimetro);
    }
    
    
    
}
