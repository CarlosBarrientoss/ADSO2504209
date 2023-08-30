
public class Principal {

    public static void mian(String[] args) {

        Rectangulo lote = new Rectangulo(10,15);
         hallarAreaGeneral(lote);
        
       /* lote.hallarArea();
        lote.hallarPerimetro();*/
        
        System.out.println(" ");
        
        Rectangulo lote2 = new Rectangulo(10,15);
         hallarAreaGeneral(lote2);
        
        /*lote2.hallarArea();
        lote2.hallarPerimetro();*/
        
        System.out.println(" ");
        
        Triangulo lote3 = new Triangulo(10,10, 10, 10);
        
        hallarAreaGeneral(lote2);
        
        /*lote3.hallarArea();;
        lote3.hallarPerimetro();*/
        
        
    }
    
    public static void hallarAreaGeneral(IFigura lote){
        lote.hallarArea();
    }
}

