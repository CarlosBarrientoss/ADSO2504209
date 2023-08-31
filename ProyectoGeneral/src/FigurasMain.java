import figuras.Cuadrado;
import figuras.Figura;
import figuras.Hexagono;
import figuras.Paralelogramo;
import figuras.Pentagono;
import figuras.Rectangulo;
import figuras.Triangulo;

public class FigurasMain {

    public static void main(String[] args) {

        Rectangulo lote1 = new Rectangulo(10, 15);
        hallarAreaGeneral(lote1);
        hallarPerimetroGeneral(lote1);
        System.out.println("");

        Rectangulo lote2 = new Rectangulo(20, 20);
        hallarAreaGeneral(lote2);
        hallarPerimetroGeneral(lote2);
        System.out.println("");

        Triangulo lote3 = new Triangulo(10, 10);
        hallarAreaGeneral(lote3);
        hallarPerimetroGeneral(lote3);
        System.out.println("");

        Cuadrado lote4 = new Cuadrado(15, 12);
        hallarAreaGeneral(lote4);
        hallarPerimetroGeneral(lote4);
        System.out.println("");

        Paralelogramo lote5 = new Paralelogramo(21, 8);
        hallarAreaGeneral(lote5);
        hallarPerimetroGeneral(lote5);
        System.out.println("");

        Pentagono lote6 = new Pentagono(32, 9);
        hallarAreaGeneral(lote6);
        hallarPerimetroGeneral(lote6);
        System.out.println("");

        Hexagono lote7 = new Hexagono(11, 17);
        hallarAreaGeneral(lote7);
        hallarPerimetroGeneral(lote7);
        System.out.println("");

    }
    
    public static void hallarAreaGeneral(Figura lote) {
        lote.hallarArea();
    }
    public static void hallarPerimetroGeneral(Figura lote) {
        lote.hallarPerimetro();
    }
}
