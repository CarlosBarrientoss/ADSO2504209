import figuras.*;

public class Principal {
    public static void main(String[] args) {

        // Abstraccion del problema 

        
        // Instancia 1 de la clase rectangulo
        Rectangulo lote1 = new Rectangulo(10.0, 15.0);
        hallarAreaGeneral(lote1);
        hallarPerimetroGeneral(lote1);

        System.out.println(" ");
        // Instancia 2 de la clase rectangulo
        Rectangulo lote2 = new Rectangulo(20.0, 20.0);
        hallarAreaGeneral(lote2);
        hallarPerimetroGeneral(lote2);

        System.out.println(" ");
        TrianguloEquilatero lote3 = new TrianguloEquilatero(10, 10);
        hallarAreaGeneral(lote3);
        hallarPerimetroGeneral(lote3);
        System.out.println(" ");
        
        Paralelogramo lote4 = new Paralelogramo(10, 20);
        hallarAreaGeneral(lote4);
        hallarPerimetroGeneral(lote4);

        System.out.println(" ");

        Cuadrado lote5 = new Cuadrado(10, 20);
        hallarAreaGeneral(lote5);
        hallarPerimetroGeneral(lote5);
        
        System.out.println(" ");

        Pentagono lote6 = new Pentagono(10, 20);
        hallarAreaGeneral(lote6);
        hallarPerimetroGeneral(lote6);

        System.out.println(" ");

        Hexagono lote7 = new Hexagono(10, 20);
        hallarAreaGeneral(lote7);
        hallarPerimetroGeneral(lote7);

  
    }
    

    public static void hallarAreaGeneral(Figura lote) {
        lote.hallarArea();
    }

    public static void hallarPerimetroGeneral(Figura lote){
        lote.hallarPerimetro();
    }
}

