package figuras;


public class Rectangulo extends Figura {
    // SEGUNDO ELEMENTO DE LA PROGRAMACION ORIENTADA A OBJETOS ( ATRIBUTOS )
 
    


    public Rectangulo(double base, double altura) {
        super(base, altura);
        //TODO Auto-generated constructor stub
    }

    // TERCER ELEMENTO DE LA PROGRAMACION ORIENTADA A OBJETOS ( METODOS )
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

    // public void hallarArea() {

   
    // }
    @Override
    public void hallarPerimetro() {
        
        // Logica para hallar el perimetro de un rectangulo
        double perimetro = (base + altura) * 2;
        System.out.println("El perimetro del rectangulo es " + perimetro);
}

    @Override
    public void hallarArea() {
        //     Logica para hallar el area de un rectangulo
        double area = base * altura;
        System.out.println("El area del rectangulo es " + area);
    }
}
