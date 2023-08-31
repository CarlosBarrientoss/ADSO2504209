package projectojava;
//primer elemento de la poo

public class Rectangulo implements IFigura {
    //abstraccion del problema
    //abstraccion
    private double base;
    private double altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }


    //tercer elemento de la poo

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
//    public void hallarPerimetro() {
//        //logica para hayar el area del perimetro
//        double p.out.println("El perimetro de el rectangulo es: " + perimetro);erimetro = (base + altura) * 2;
//        System
//    }
//    public void hallarArea(){
//        //logica para hayar el area de un rectangulo
//        double  area = base*altura;
//        System.out.println("area del rectangulo: " + area);
//    }
    @Override
    public void hallarArea(){
        double  area = base*altura;
        System.out.println("area del rectangulo: " + area);
    }



    }
