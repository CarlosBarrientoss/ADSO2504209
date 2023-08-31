package figuras;

// Primer elemento de la POO (la clase)
public class Rectangulo extends Figura {
    
    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public void hallarPerimetro() {
         // Logica para hallar el perímetro de un rectangulo
        double perimetro = 2 * (base + altura);
        System.out.println("Perímetro del rectángulo: " + perimetro);
    }

    @Override
    public void hallarArea() {
        // Logica para hallar el area de un rectangulo
        double area = base * altura;
        System.out.println("Área del rectángulo: " + area);
    }
}
