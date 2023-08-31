package proyecto_java;

public class Main {
    public static void main(String... args){


        Rectangulo loteRectangulo = new Rectangulo(15, 10);
        hallarAreaGeneral(loteRectangulo);
        hallarPerimetroGeneral(loteRectangulo);
        System.out.println("");

        Cuadrado loteCuadrado = new Cuadrado(15);
        hallarAreaGeneral(loteCuadrado);
        hallarPerimetroGeneral(loteCuadrado);
        System.out.println("");

        Triangulo loteTriangulo = new Triangulo(20, 12);
        hallarAreaGeneral(loteTriangulo);
        hallarPerimetroGeneral(loteTriangulo);
        System.out.println("");
    }

    public static void hallarAreaGeneral(FigurasGeometricas figura){
        figura.hallarArea();
    }

    public static void hallarPerimetroGeneral(FigurasGeometricas figura){
        figura.hallarPerimetro();
    }
}
