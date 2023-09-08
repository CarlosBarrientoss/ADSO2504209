package ProyectoJava;

public class Principal {

    public static void main(String[] args) {
        // Instancia 1 de la clase rectangulo
        Rectangulo lote1 = new Rectangulo(10, 15);
        hallarAreaGenral(lote1);

        System.out.println("");
        // // Instancia 2 de la clase rectangulo
        Rectangulo lote2 = new Rectangulo(20, 20);
        hallarAreaGenral(lote2);

        System.out.println("");

        // // Instancia 1 de la clase triangulo
        Triangulo lote3 = new Triangulo(10, 20);
        hallarAreaGenral(lote3);

        System.out.println("");

    }

    public static void hallarAreaGenral(IFiguras lote) {
        lote.hallarArea();

    }
}
