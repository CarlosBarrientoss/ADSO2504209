package proyectoJava;

public class Main {
    public static void main(String[] args) {

        Cuadrado cuadrado = new Cuadrado(23 );
        cuadrado.hallarArea();
        cuadrado.hallarPerimetro();

        System.out.println("");

        Triangulo triangulo = new Triangulo(12,25);
        triangulo.hallarArea();
        triangulo.hallarPerimetro();

    }
}
