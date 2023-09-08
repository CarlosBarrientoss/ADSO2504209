package projectojava;

public class Triangulo implements IFigura{
    private double base;
    private double altura;
    private double cateto1;
    private double cateto2;
    private double cateto3;


    public Triangulo(double base, double altura, double cateto1, double cateto2, double cateto3){
        this.altura = altura;
        this.base = base;
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        this.cateto3 = cateto3;
    }

    public double getBase(){
        return base;
    }
    public void setBase(double base){
        this.base = base;
    }
    public double getAltura(){
        return altura = altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

//    public void hallarArea(){
//        double area = (base*altura)/2;
//        System.out.println("El area del triangulo es: " + area);
//    }
//    public void hallarPerimetro(){
//        double perimetro = cateto1+cateto2+cateto3;
//        System.out.println("El perimetro del triangulo es: "+ perimetro);
//    }
    @Override
    public void hallarArea(){
        double area = (base*altura)/2;
        System.out.println("El area del triangulo es: " + area);
    }
}
