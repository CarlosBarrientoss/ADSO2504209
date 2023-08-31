import java.util.Scanner;

public class PilaresMain {
    public static void main(String[] args) {
    
        Rectangulo rectangulo = new Rectangulo(10, 10);
        hallarAreaGeneral(rectangulo);
    // abstraccion del problema

    // atributos
    // double base = 10;
    // double altura = 15;
    
    // logica para hallar el area
    // double area =  base * altura;
    // System.out.println(area);

    // logica para hallar el perimetro
    // double perimertro = 2 * (base+altura);
    // System.out.println(perimertro);

    // calcularArea(base, altura);
    // calcularPerimetro(base, altura);
    // Rectangulo rectangulo = new Rectangulo(12, 16);
    // hallarAreaGeneral(rectangulo);   


    // Triangulo triangulo = new Triangulo(10,10);
    //     hallarAreaGeneral(triangulo);

    // Poligonos pologono = new Poligonos();
    // hallarAreaGeneral(pologono);

    // Rectangulo rectangulo = new Rectangulo(19, 10);
    // hallarAreaGeneral(rectangulo);
    }

    
   public static void hallarAreaGeneral(IPoligono lote){
        lote.calcularArea();
   }

}
