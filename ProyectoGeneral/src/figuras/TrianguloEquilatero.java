package figuras;


public class TrianguloEquilatero extends Figura {
    
    
    


    public TrianguloEquilatero(double base, double altura) {
        super(base, altura);
        //TODO Auto-generated constructor stub
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




    @Override
    public void hallarArea() {
        // Logica para hallar el area de un triangulo
        double area = (base * altura) / 2;
        System.out.println("El area del Triangulo es " + area);
    }


    @Override
    public void hallarPerimetro() {
        
        // Logica para hallar el perimetro de un triangulo
        double perimetro = base + altura + altura;
        System.out.println("El perimetro del Triangulo es " + perimetro);
}
   
}
