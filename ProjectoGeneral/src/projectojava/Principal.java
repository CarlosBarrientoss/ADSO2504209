package projectojava;

public class Principal {
    public static void main(String[] args) {

        Rectangulo lote  = new Rectangulo(10,15);
        hallarAreaGeneral(lote);


        System.out.println("");
        Rectangulo lote2  = new Rectangulo(20,20);
        //hallarAreaGeneral(lote2);


        System.out.println("");
        Triangulo tr1 = new Triangulo(10,10,80,15.5,16);
        //hallarAreaGeneral(tr1);

    }
    public static void hallarAreaGeneral(IFigura lote){
        lote.hallarArea();
    }


}
