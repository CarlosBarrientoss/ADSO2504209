package sena.jonathan_avendano.mains;

import sena.jonathan_avendano.java_pillars.*;

public class GeometricFiguresMainApp {
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

    public static void hallarAreaGeneral(IGeometricFigures figura){
        figura.calculateArea();
    }

    public static void hallarPerimetroGeneral(IGeometricFigures figura){
        figura.calculatePerimeter();
    }
}
