public class Rectangulo implements IFigura{

    // segundo elementi de la poo
    // Abstaccion del problema
    double base;
    double altura;

    public Rectangulo(double base, double altura) {

        // tercer elemento de la poo
        this.base = base;
        this.altura = altura;
    }
@Override
    public void hallarArea() {

        double area = base * altura;
        System.out.println("area del rectangulo = " + area);

    }

    public void hallarPerimetro() {

        double perimetro = (2 * (base + altura));
        System.out.println("El perimetro del rectangulo es = " + perimetro);
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

}