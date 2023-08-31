
package com.mycompany.pilaresenjavaa;


public class Triangulo implements IFigura{
    private double lado1;
    private double lado2;
    private double base;
    private double altura;

    public Triangulo(double lado1, double lado2, double base, double altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura=altura;
    }
        @Override
        public  void hallarArea(){
        
        double area=(altura*base)/2;
        System.out.println("area = " + area + " metros");
    }   
        
        public  void hallarPerimetro(){
        double perimetro= lado1+lado2+base;
        System.out.println("perimetro = " + perimetro);
    }
    
}
