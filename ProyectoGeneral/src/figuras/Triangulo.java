package figuras;

public class Triangulo extends Figura {
    
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public void hallarPerimetro() {
        // Logica para hallar el perímetro de un triángulo
        // NOTA: no es la forma correcta de calcular perimetro porque debe ser lado1 + lado2 + lado3
        double perimetro = base + altura + altura;
        System.out.println("Perímetro del triangulo: " + perimetro);
    }

    @Override
    public void hallarArea() {
        // Logica para hallar el area de un triángulo
        double area = (base * altura) / 2;
        System.out.println("Área del triangulo: " + area);
    }
}
