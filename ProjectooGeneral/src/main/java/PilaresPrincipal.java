
import PilaresJava.IFigura;
import PilaresJava.Rectangulo;
import PilaresJava.Triangulo;


public class PilaresPrincipal {

    public static void main(String[] args) {

        System.out.println(" RECTANGULO ");
        
        // Instancia 1 de la clase rectangulo
        Rectangulo lote1 = new Rectangulo(10, 15);
        hallarAreaGeneral(lote1);

        System.out.println(" ");

        // Instancia 2 de la clase rectangulo
        // rectangulo lote2 = new rectangulo(20, 20);
        // hallarAreaGeneral(lote2);


        System.out.println(" ");

        System.out.println(" TRIANGULO");

// Instancia 1 de la clase triangulo
        Triangulo triangulo = new Triangulo(10,10,10,10);
         hallarAreaGeneral(triangulo);
     
        System.out.println("");
    }

public static void hallarAreaGeneral(IFigura lote){
    lote.hallarArea();

}
}