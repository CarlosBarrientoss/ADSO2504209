//  primer elemeto la clase
public class Rectangulo implements IPoligono {

    // segundo elemento los atributos
    
    // atributos
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // public Rectangulo(double base, double altura){
    //     super(base, altura);
    // }

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

    public void calcularArea(){
        double area = base * altura;
        System.out.println("El area es igual a: " + area);
    }

    public void calcularPerimetro(){
        double perimetro = 2 * (base+altura);
        System.out.println("El perimetro es igual a: " + perimetro);
}

    // @Override
    // public void calcularArea(double base, double altura) {
    //     double area = base * altura;
    //     System.out.println("El area es igual a: " + area);
    // }

}