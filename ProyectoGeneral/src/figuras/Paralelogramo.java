package figuras;

public class Paralelogramo extends Figura {

    public Paralelogramo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public void hallarPerimetro() {
        // Logica para hallar el perímetro de un paralelogramo
        // Nota: no es la formula correcta de perimetro de paralelogramo
        double perimetro = 2 * (base + altura);
        System.out.println("Perímetro del paralelogramo: " + perimetro);
    }

    @Override
    public void hallarArea() {
        // Logica para hallar el area de un paralelogramo
        double area = base * altura;
        System.out.println("Área del paralelogramo: " + area);
    }
    
}
