package proyectojava;
//Primer elemento de la POO
public class Rectangulo implements IFigura {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void hallarArea(){
        //Logica para hallar el area de un rectangulo
        double area = base * altura;
        System.out.println("area = " + area);
    }

    public void hallarPerimetro(){

        //Logica para hallar el perimetro de un rectangulo
        double perimetro = (base + altura) * 2;
        System.out.println("perimetro = " + perimetro);
    }

    //Tercer elemento de la POO
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
