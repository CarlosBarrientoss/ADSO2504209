public class Triangulo implements IPoligono {

    protected double base;
    protected double altura;

    // public Triangulo(double base, double altura){
    //     super(base, altura);
    // }


    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getLado1() {
        return base;
    }

    public void setLado1(double base) {
        this.base = base;
    }

    public double getLado2() {
        return altura;
    }

    public void setLado2(double altura) {
        this.altura = altura;
    }


    public void calcularArea(){
        double area = (base * altura)/2;
        System.out.println("EL area es: " + area);
    }

    public void calcularPerimetro(){
        double perimetro = base+altura+altura;
        System.out.println("El perimtro es: " + perimetro);
    }
}