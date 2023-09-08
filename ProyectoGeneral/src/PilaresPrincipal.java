import proyectojava.Rectangulo;

public class PilaresPrincipal {

    public static void main(String[] args) {

        //Instancia uno de la clase rectangulo
        Rectangulo lote1 = new Rectangulo(10,15);
        hallarAreaGeneral(lote1);

        //System.out.println("");

        //Instancia 2 de la clase rectangulo
        //Rectangulo lote2 = new Rectangulo(20,20);
        //hallarAreaGeneral(lote2);



        System.out.println("");

        //Instancia 1 de la clase triangulo
        //Triangulo lote3 = new Triangulo(20, 15);R
        //hallarAreaGeneral(lote3);


    }

    public static void hallarAreaGeneral(proyectojava.IFigura lote){
        lote.hallarArea();

    }
}
