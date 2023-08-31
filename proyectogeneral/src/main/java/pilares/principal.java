
package com.mycompany.pilaresenjavaa;

public class principal {
    public static void main(String[] args) {
        //instancia uno de la clse rectangulo
        Rectangulo lote1=new Rectangulo(10, 15);      
        hallarAreaGeneral(lote1);
        
//        System.out.println(" ");
        //instancia uno de la clse rectangulo
//        Rectangulo lote2=new Rectangulo(20, 20);
//        System.out.println("rectangulo");
 //       hallarAreaGeneral(lote2);
        
//        System.out.println("   ");
        
//        Triangulo lote3=new  Triangulo(10,10,10,10);
//        System.out.println("triangulo");
//        hallarAreaGeneral(lote3);
//        
    }

    public static void hallarAreaGeneral(IFigura lote){
    lote.hallarArea();
 
}

}
